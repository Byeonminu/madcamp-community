package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.*;
import springdb.dbtest.entity.BoardType;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.entity.Recomment;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.BoardCommentRepository;
import springdb.dbtest.repository.BoardReCommentRepository;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.BoardTypeRepository;
import springdb.dbtest.service.BoardService;
import springdb.dbtest.service.MyProfileService;

import java.util.List;

import static java.lang.Math.toIntExact;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/myprofile") // version1의 API
public class MyProfileController {

    private final MyProfileService myProfileService;

    @GetMapping("/myComments")
    public MyProfileCommentRespDto getComments(@AuthenticationPrincipal User user, @RequestParam("pagenum") int pagenum) {
        return myProfileService.getMyComments(user.getId(),pagenum);
    }
    @GetMapping("/myBoards")
    public BoardLIstRespDto getBoards(@AuthenticationPrincipal User user, @RequestParam("pagenum") int pagenum) {
        return myProfileService.getMyBoard(user.getId(),pagenum);
    }









}