package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.service.BoardService;
import springdb.dbtest.service.CommentService;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/board") // version1의 API
public class BoardController {

    private final BoardService boardService;
    private final CommentService commentService;

    // 공지사함
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Board> getNotificationBoard(@RequestParam(value = "type") Long type,
                                            @RequestParam(value = "pagenum") int pagenumber) {
        System.out.println("보드요청 입니다 ~~~~");
        List<Board> boardList = boardService.get10latestboard(type, pagenumber);
        return boardList;
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public List<Board> getoneboard(@PathVariable("id") Long boardid) {
        return boardService.findAllWithCommentUsingFetchJoin(boardid);
    }


    //그 글에 맞는 댓글 가져오기
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public List<Board> getcomment(@PathVariable) {
//        return boardService.findAllWithCommentUsingFetchJoin();
//    }




    //새 글 작성
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void createnewboard(HttpServletRequest request) {
        LocalDateTime now = LocalDateTime.now();
        // 현재 날짜/시간 출력
        System.out.println(now); // 2021-06-17T06:43:21.419878100
        // 포맷팅
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow);  // 2021년 06월 17일 06시 43분 21초
        BoardReqDto boardReqDto = new BoardReqDto(0L, Long.parseLong(request.getParameter("userid")),
                Long.parseLong(request.getParameter("type")),
                request.getParameter("title"),
                request.getParameter("description"),
                0,
               0,
                0,
                now,
                now);

        boardService.insertBoardInfo(boardReqDto);
        return;
    }








}