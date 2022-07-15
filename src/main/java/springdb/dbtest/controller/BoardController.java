package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.entity.Board;
import springdb.dbtest.service.BoardService;

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







}