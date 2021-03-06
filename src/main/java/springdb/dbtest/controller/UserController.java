package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardLIstRespDto;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.SignupReqDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.BoardType;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.repository.BoardTypeRepository;
import springdb.dbtest.repository.EmailRepository;
import springdb.dbtest.service.BoardService;
import springdb.dbtest.service.CommentService;
import springdb.dbtest.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Math.toIntExact;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;
    private final EmailRepository emailRepository;

//    @PostMapping("/insertUser")
//    @ResponseBody
//    public boolean signup(UserDto userDto) { // 회원 추가
//
//
//
//    }

    //email 인증번호
    @PostMapping("/emailcheck")
    @ResponseBody
    public boolean emailauth(HttpServletRequest request, @RequestParam String email) {
        System.out.println("이메일 체크: " + email);
        if(emailRepository.existsByEmail(email) == false) return false; // DB에 있는 이메일이 맞는지 확인
        else{
            if(userService.alreadyexist(email) == true ) return false; // 이미 가입한 계정이 있을 경우
            else{
                HttpSession session = request.getSession();
                return userService.authEmail(session, email);
            }
        }

    }

    @PostMapping("/emailcheck/key")
    @ResponseBody
    public boolean emailCertification(HttpServletRequest request, SignupReqDto signupReqDto) {
        HttpSession session = request.getSession();
        boolean result = userService.emailCertification(session, signupReqDto.getUsername(), signupReqDto.getInputCode());

        System.out.println("키 체크: trueorfalse : "+  result);

        if(result == false) return false;// 키가 다를 때
        else{
            //이미 가입한 이메일인지 체크
            UserDto userDto = new UserDto(signupReqDto.getUsername(),
                    signupReqDto.getPassword(),
                    signupReqDto.getNickname(),
                    signupReqDto.getIsadmin(),
                    signupReqDto.getIntroduction(),
                    signupReqDto.getPicture());
            Long test = userService.save(userDto); // 유저 정보 저장
            if(test != null) return true;
            else return false;
        }
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