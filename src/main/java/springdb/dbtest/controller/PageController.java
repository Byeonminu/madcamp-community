package springdb.dbtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.dto.UserDto;
import springdb.dbtest.entity.User;
import springdb.dbtest.repository.UserRepository;
import springdb.dbtest.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        System.out.println("유저 정보 : "+ user);
        model.addAttribute("principal", user);
        return "board_write/board_write";
    }


    @PostMapping("/board-write")
    public String PostNewBoard(HttpServletRequest request) {
        LocalDateTime now = LocalDateTime.now();
        // 현재 날짜/시간 출력
        System.out.println(now); // 2021-06-17T06:43:21.419878100
        // 포맷팅
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow);  // 2021년 06월 17일 06시 43분 21초
        Long type = Long.valueOf(request.getParameter("type"));
        BoardReqDto boardReqDto = new BoardReqDto(0L, Long.parseLong(request.getParameter("userid")),
                type,
                request.getParameter("title"),
                request.getParameter("description"),
                0,
                0,
                0,
                now,
                now);

        boardService.insertBoardInfo(boardReqDto);
        System.out.println("보드 라이트");

        return "redirect:/board-main?type="+type;
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
    @GetMapping("/admin")
    public String adminMainForm() {
        return "admin/admin";
    }





    // @GetMapping("/board-main/{board_id}")
    // public String boardForm(){
    // System.out.println("여기에요 여기 !!");
    // return "board/board";
    // }
}
