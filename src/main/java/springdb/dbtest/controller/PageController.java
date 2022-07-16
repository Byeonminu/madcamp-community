package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.SignupReqDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.User;
import springdb.dbtest.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class PageController {

    @GetMapping("/board-main")
    public String boardForm(Model model, @AuthenticationPrincipal User user, @RequestParam Long type) {
        model.addAttribute("principal", user);
        model.addAttribute("type",type);
        return "board/board";
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "auth/signup";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping({ "/", "/index" })
    public String indexForm(Model model, @AuthenticationPrincipal User user) {
        System.out.println("유저 정뵈ㅣ:: " + String.valueOf(user));
        System.out.println("여기에요 여기 !!");
        model.addAttribute("user", user);
        return "index";
    }
    @GetMapping("/board-main/detail")
    public String boardDetailForm() {
        return "board/board_detail";
    }


    // @GetMapping("/board-main/{board_id}")
    // public String boardForm(){
    // System.out.println("여기에요 여기 !!");
    // return "board/board";
    // }
}
