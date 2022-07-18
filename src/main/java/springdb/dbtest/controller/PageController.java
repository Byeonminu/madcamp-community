package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.UserRepository;
import springdb.dbtest.service.BoardService;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PageController {
    private final BoardService boardService;
    private final UserRepository userRepository;
    @GetMapping("/board-main")
    public String boardForm(Model model, @AuthenticationPrincipal User user, @RequestParam Long type) {
        model.addAttribute("principal", user);
        model.addAttribute("type",type);
        return "board/board";
    }

    @GetMapping("/board-write")
    public String writeForm(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("principal", user);
        return "board_write/board_write";
    }

    @GetMapping("/search") // 쿼리로 검색어 넣으면 될 듯?
    public String searchForm() {
        return "search/search";
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "auth/signup";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping("/info")
    public String infoForm() {
        return "user_info/info";
    }

    @GetMapping({ "/", "/index" })
    public String indexForm(Model model, @AuthenticationPrincipal User user) {
        System.out.println("유저 정뵈ㅣ:: " + String.valueOf(user));
        System.out.println("여기에요 여기 !!");
        model.addAttribute("user", user);
        return "index";
    }
    @GetMapping("/board-main/{id}")
    public String boardDetailForm(@PathVariable Long id,Model model, @AuthenticationPrincipal User user) {
        BoardRespDto boardRespDto = boardService.getBoardDetail(id);
        Optional<User> userOp = userRepository.findById(boardRespDto.getUserid());
        UserDto userDto = userOp.get().toDto();
        model.addAttribute("boardRespDto",boardRespDto);
        model.addAttribute("userDto",userDto);
        model.addAttribute("user",user);
        return "board/board_detail";
    }


    // @GetMapping("/board-main/{board_id}")
    // public String boardForm(){
    // System.out.println("여기에요 여기 !!");
    // return "board/board";
    // }
}
