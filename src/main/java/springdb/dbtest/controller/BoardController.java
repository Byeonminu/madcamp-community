package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.service.BoardService;

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

    // 공지사함
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Board> getNotificationBoard(@RequestParam(value = "type") Long type) {
        return boardService.get10latestboard(type);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Board> getoneboard(@PathVariable("id") Long id) {
        return boardService.getOneboardbyid(id);
    }


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