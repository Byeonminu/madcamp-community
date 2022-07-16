package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardLIstRespDto;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.BoardType;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.repository.BoardTypeRepository;
import springdb.dbtest.service.BoardService;
import springdb.dbtest.service.CommentService;
import springdb.dbtest.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Math.toIntExact;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/insertUser")
    public String signup(UserDto userDto) { // 회원 추가


        //비밀번호 체크, 이미 가입한 이메일인지 체크
        Long test = userService.save(userDto); // 유저 정보 저장
        return "redirect:/";
    }

//    @GetMapping("/login")
//    public String login(UserDto userDto) { // 회원 추가
//
//        try{
//            System.out.println("로그인으로 들어온 유저: " + userDto);
////            String username = userService.login(userDto);
////            System.out.println("로그인한 유저 이름: " + username);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        return "redirect:/";
//    }

    @GetMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }


}