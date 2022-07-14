package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdb.dbtest.entity.Board;
import springdb.dbtest.service.BoardService;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/home") // version1의 API
public class HomeController {

    private final BoardService boardService;

    // 공지사함
    @GetMapping("notification")
    public List<Board> getNotificationBoard() {

        return null;
    }
    // best 게시판
    @GetMapping("best")
    public List<Board> getBestBoard() {

        return null;
    }
    // 정보게시판
    @GetMapping("info")
    public List<Board> getInfoBoard() {

        return null;
    }
    // 14기 게시판
    @GetMapping("generation-14")
    public List<Board> getGeneration14Board() {
        List<Board> tt = boardService.getGeneration14Board();
        System.out.println(tt);
        return tt;
    }


}