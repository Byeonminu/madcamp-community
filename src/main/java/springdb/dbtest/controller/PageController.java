package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springdb.dbtest.entity.User;

@Controller
public class PageController {

    @GetMapping("/board-main")
    public String boardForm(Model model, @AuthenticationPrincipal User user){
        model.addAttribute("principal", user);
        return "board/board";
    }


    @GetMapping("/signup")
    public String signupForm(){
        return "auth/signup";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "auth/login";
    }

    @GetMapping({"/","/index"})
    public String indexForm(Model model, @AuthenticationPrincipal User user){
        model.addAttribute("principal", user);
        System.out.println("유저 정보:: " + String.valueOf(user));
        return "index";
    }



//    @GetMapping("/board-main/{board_id}")
//    public String boardForm(){
//        System.out.println("여기에요 여기 !!");
//        return "board/board";
//    }
}
