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
import springdb.dbtest.entity.ViewCnt;
import springdb.dbtest.repository.UserRepository;
import springdb.dbtest.repository.ViewCntRepository;
import springdb.dbtest.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PageController {
    private final BoardService boardService;
    private final UserRepository userRepository;

    private final ViewCntRepository viewCntRepository;

    @GetMapping("/board-main")
    public String boardForm(Model model, @AuthenticationPrincipal User user, @RequestParam Long type) {

        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        model.addAttribute("principal", user);
        model.addAttribute("type", type);
        return "board/board";
    }

    @GetMapping("/board-write")
    public String writeForm(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        System.out.println("유저 정보 : " + user);
        model.addAttribute("principal", user);
        return "board_write/board_write";
    }

    @PostMapping("/board-write")
    public String PostNewBoard(HttpServletRequest request, @AuthenticationPrincipal User user) {
        LocalDateTime now = LocalDateTime.now();
        // 포맷팅
        LocalDateTime formatedNow = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), now.getHour(),
                now.getMinute(), 0);

        // 포맷팅 현재 날짜/시간 출력
        Long type = Long.valueOf(request.getParameter("type"));

        String isanonymous = "익명";
        if (request.getParameter("anonymous") == null)
            isanonymous = user.getNickname();

        BoardReqDto boardReqDto = new BoardReqDto(0L, Long.parseLong(request.getParameter("userid")),
                type,
                request.getParameter("title"),
                request.getParameter("description"),
                0,
                0,
                0,
                formatedNow,
                formatedNow,
                isanonymous);

        boardService.insertBoardInfo(boardReqDto);

        return "redirect:/board-main?type=" + type;
    }

    @GetMapping("/search") // 쿼리로 검색어 넣으면 될 듯?
    public String searchForm(Model model) {
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        return "search/search";
    }

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        return "auth/signup";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        return "auth/login";
    }

    @GetMapping("/myprofile")
    public String infoForm(@AuthenticationPrincipal User principal, Model model) {
        model.addAttribute("user", principal);
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        return "user_info/info";
    }

    @GetMapping({ "/", "/index" })
    public String indexForm(Model model, @AuthenticationPrincipal User user) {

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar time = Calendar.getInstance();
        String today = format1.format(time.getTime());
        Long view_cnt = 0L;

        if (viewCntRepository.existsByDate(today) == false) { // 오늘의 첫 방문
            viewCntRepository.save(new ViewCnt(0L, today, 1L));
            view_cnt = 1L;
        } else {
            viewCntRepository.updateView(today); // +1
            ViewCnt temp = viewCntRepository.findByDate(today);
            view_cnt = temp.getCnt();
        }
        model.addAttribute("viewcnt", view_cnt);
        System.out.println("여기에요 여기 !!");
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/board-main/{id}")
    public String boardDetailForm(@PathVariable Long id, Model model, @AuthenticationPrincipal User user) {
        BoardRespDto boardRespDto = boardService.getBoardDetail(id);
        Optional<User> userOp = userRepository.findById(boardRespDto.getUserid());
        UserDto userDto = userOp.get().toDto();
        model.addAttribute("boardRespDto", boardRespDto);
        model.addAttribute("userDto", userDto);
        model.addAttribute("user", user);
        model.addAttribute("viewcnt", viewCntRepository
                .findByDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())).getCnt());
        return "board/board_detail";
    }

    @GetMapping("/admin")
    public String adminMainForm() {
        return "admin/admin";
    }
}
