package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.service.BoardService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/board") // version1의 API
public class BoardController {

    private final BoardService boardService;

    // 공지사함
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Board> getNotificationBoard(@RequestParam(value = "type") Long type) {
        System.out.println("잘 받아오나 : type");

        return boardService.get10latestboard(type);
    }



}