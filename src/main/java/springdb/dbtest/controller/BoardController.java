package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.*;
import springdb.dbtest.entity.*;
import springdb.dbtest.repository.*;
import springdb.dbtest.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Math.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/board") // version1의 API
public class BoardController {

    private final BoardService boardService;
    private final BoardTypeRepository boardTypeRepository;
    private final BoardCommentRepository boardCommentRepository;
    private final BoardReCommentRepository boardReCommentRepository;


    private final BoardRepository boardRepository;
    private final BoardLikeRepository boardLikeRepository;
    private final BoardReportRepository boardReportRepository;
    ////////////////////////////////////////////////////////////////////////////////
    private final CommentRepository commentRepository;
    private final CommentLikeRepository commentLikeRepository;
    private final CommentReportRepository commentReportRepository;
    ////////////////////////////////////////////////////////////////////////////////
    private final RecommentLikeRepository recommentLikeRepository;
    private final RecommentRepository recommentRepository;
    private final RecommentReportRepository recommentReportRepository;


    // type에 따라 게시글 10개 가져오기
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BoardLIstRespDto getNotificationBoard(@RequestParam(value = "type") Long type,
                                                 @RequestParam(value = "pagenum") int pagenumber) {
        System.out.println("개수 : " + toIntExact(boardService.getBoardcount(type)));
        BoardLIstRespDto boardLIstRespDto = new BoardLIstRespDto(boardService.get10latestboard(type, pagenumber), toIntExact(boardService.getBoardcount(type)));
        return boardLIstRespDto;
    }



    // board category 종류 불러오기
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<BoardType> getBoardType() {
        return boardTypeRepository.findAllByOrderByIdAsc();
    }


    //요청을 하면 board id와 매칭되는 comment를 가져옴
    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public List<BoardCommentRespDto> getcomment(@PathVariable("id") Long boardId) {
        List<BoardCommentRespDto> boardCommentList= boardService.getCommentListByBoardId(boardId);
        return boardCommentList;
    }
    //요청을 하면 comment id와 매칭되는 recomment를 가져옴
    @RequestMapping(value = "/recomment/{id}", method = RequestMethod.GET)
    public List<BoardRecommentRespDto> getrecomment(@PathVariable("id") Long commentId) {
        List<BoardRecommentRespDto> boardRecommentList = boardService.getRecommentListByCommentId(commentId);
        return boardRecommentList;
    }


    //댓글 작성
    @PostMapping("/comment_write")
    public void commentWrite(CommentReqDto commentReqDto) {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        Comment comment = new Comment(0L,commentReqDto.getPrincipalUserId(),boardRepository.findById(commentReqDto.getBoardid()).get(),commentReqDto.getComment(),0,0,formatedNow,null);
        boardRepository.plusonecomment(commentReqDto.getBoardid());
        boardCommentRepository.save(comment);
    }
    //대댓글 작성
    @PostMapping("/recomment_write")
    public void recommentWrite(RecommentReqDto recommentReqDto) {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        Recomment recomment = new Recomment(0L,recommentReqDto.getPrincipalUserId(),boardCommentRepository.findById(recommentReqDto.getCommentid()).get(),recommentReqDto.getRecomment(),0L,0, formatedNow);
        boardReCommentRepository.save(recomment);
    }

    @GetMapping("/search")
    public BoardLIstRespDto searchBoard(@RequestParam("search") String search, @RequestParam("pagenum") int pagenum) {
        return boardService.searchBoard(search,pagenum);
    }




    ////// 좋아요 ////// ////// 좋아요 ////// ////// 좋아요 ////// ////// 좋아요 ////// ////// 좋아요 //////
    @PostMapping("/likeup/board")
    public String likeupboard(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long boardid = Long.valueOf(request.getParameter("boardid"));

        BoardLike check = boardLikeRepository.alreadyexist(user.getId(), boardid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            boardLikeRepository.insertdata(user.getId(), boardid);
            boardRepository.plusonelike(boardid);
        }

        return "redirect:/board-main/" + boardid;
    }

    @PostMapping("/likeup/comment")
    public String likeupcomment(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long commentid = Long.valueOf(request.getParameter("commentid"));

        CommentLike check = commentLikeRepository.alreadyexist(user.getId(), commentid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            commentLikeRepository.insertdata(user.getId(), commentid);
            commentRepository.plusonelike(commentid);
        }

        return "redirect:/board-main/" + commentid;
    }

    @PostMapping("/likeup/recomment")
    public String likeuprecomment(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long recommentid = Long.valueOf(request.getParameter("recommentid"));

        RecommentLike check = recommentLikeRepository.alreadyexist(user.getId(), recommentid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            recommentLikeRepository.insertdata(user.getId(), recommentid);
            recommentRepository.plusonelike(recommentid);
        }

        return "redirect:/board-main/" + recommentid;
    }


    ////// 신고 ////// ////// 신고 ////// ////// 신고 ////// ////// 신고 ////// ////// 신고 //////

    @PostMapping("/report/board")
    public String reportboard(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long boardid = Long.valueOf(request.getParameter("boardid"));

        BoardReport check = boardReportRepository.alreadyexist(user.getId(), boardid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            boardReportRepository.insertdata(user.getId(), boardid);
            boardRepository.plusonereport(boardid);
        }

        return "redirect:/board-main/" + boardid;
    }

    @PostMapping("/report/comment")
    public String reportcomment(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long commentid = Long.valueOf(request.getParameter("commentid"));

        CommentReport check = commentReportRepository.alreadyexist(user.getId(), commentid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            commentReportRepository.insertdata(user.getId(), commentid);
            commentRepository.plusonereport(commentid);
        }

        return "redirect:/board-main/" + commentid;
    }

    @PostMapping("/report/recomment")
    public String reportrecomment(HttpServletRequest request, @AuthenticationPrincipal User user) {
        Long recommentid = Long.valueOf(request.getParameter("recommentid"));

        RecommentReport check = recommentReportRepository.alreadyexist(user.getId(), recommentid);
        if(check != null){ // 이미 존재할 때

        }
        else{
            recommentReportRepository.insertdata(user.getId(), recommentid);
            recommentRepository.plusonereport(recommentid);
        }

        return "redirect:/board-main/" + recommentid;
    }



}