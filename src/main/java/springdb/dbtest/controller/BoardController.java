package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.*;
import springdb.dbtest.entity.*;
import springdb.dbtest.repository.BoardCommentRepository;
import springdb.dbtest.repository.BoardReCommentRepository;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.BoardTypeRepository;
import springdb.dbtest.service.BoardService;
import springdb.dbtest.service.CommentService;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Comment comment = new Comment(0L,commentReqDto.getPrincipalUserId(),boardRepository.findById(commentReqDto.getBoardid()).get(),commentReqDto.getComment(),0,null);
        boardRepository.plusonecomment(commentReqDto.getBoardid());
        boardCommentRepository.save(comment);
    }
    //대댓글 작성
    @PostMapping("/recomment_write")
    public void recommentWrite(RecommentReqDto recommentReqDto) {
        Recomment recomment = new Recomment(0L,recommentReqDto.getPrincipalUserId(),boardCommentRepository.findById(recommentReqDto.getCommentid()).get(),recommentReqDto.getRecomment(),0L);
        boardReCommentRepository.save(recomment);
    }

    @GetMapping("/search")
    public BoardLIstRespDto searchBoard(@RequestParam("search") String search, @RequestParam("pagenum") int pagenum) {
        return boardService.searchBoard(search,pagenum);
    }

    @PostMapping("/likeup")
    public String likeup(@RequestParam("boardId") Long boardid, @AuthenticationPrincipal User user) {

        boardRepository.plusonelike(boardid);
        return "redirect:/board-main/" + boardid;
    }








}