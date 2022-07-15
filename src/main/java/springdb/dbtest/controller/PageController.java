package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/board-main")
    public String boardForm(){
        System.out.println("여기에요 여기 !!");
        return "board/board";
    }
//    @GetMapping("/board-main/{board_id}")
//    public String boardForm(){
//        System.out.println("여기에요 여기 !!");
//        return "board/board";
//    }
}
