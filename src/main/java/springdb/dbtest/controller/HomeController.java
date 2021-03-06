package springdb.dbtest.controller;

//import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.BoardType;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.repository.BoardTypeRepository;
import springdb.dbtest.service.BoardService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/home") // version1의 API
public class HomeController {
    private final BoardTypeRepository boardTypeRepository;
    private final BoardService boardService;

    // 공지사함 3개 가져오기
    @GetMapping("notification")
    public List<Board> getNotificationBoard() {

        return boardService.getnoti3board(1L);
    }
    // best 게시판 3개 가져오기
    @GetMapping("best")
    public List<Board> getBestBoard() {
        return boardService.getBest3board();
    }
    // 정보게시판 5개 가져오기
    @GetMapping("info")
    public List<Board> getInfoBoard() {

        return boardService.get5Boardbytype(2L);
    }
    // 14기 5개 가져오기 게시판
    @GetMapping("generation-14")
    public List<Board> getGeneration14Board() {
        return boardService.get5Boardbytype(3L);
    }


//    @GetMapping("insertinfo")
//    public BoardRespDto insertInfo(@RequestParam("user_id") Long userId,
//                                   @RequestParam("type") Long type,
//                                   @RequestParam("title") String title,
//                                   @RequestParam("description") String description,
//                                   @RequestParam("comment_cnt") int comment_cnt,
//                                   @RequestParam("like_cnt") int like_cnt,
//                                   @RequestParam("report_cnt") int report_cnt ) {
//        // 현재 날짜/시간
//        LocalDateTime now = LocalDateTime.now();
//        // 현재 날짜/시간 출력
//        System.out.println(now); // 2021-06-17T06:43:21.419878100
//        // 포맷팅
//        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        // 포맷팅 현재 날짜/시간 출력
//        System.out.println(formatedNow);  // 2021년 06월 17일 06시 43분 21초
//        BoardReqDto boardReqDto = new BoardReqDto(0L,userId,type,title,description,comment_cnt,like_cnt,report_cnt,now,now);
//        return boardService.insertBoardInfo(boardReqDto);
//    }
// board category 종류 불러오기
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<BoardType> getBoardType() {
        return boardTypeRepository.findAllByOrderByIdAsc();
    }


}