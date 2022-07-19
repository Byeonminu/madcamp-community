package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.AdminRespDto;
import springdb.dbtest.dto.AdminRespListDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.entity.Recomment;
import springdb.dbtest.repository.BoardCommentRepository;
import springdb.dbtest.repository.BoardReCommentRepository;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.UserRepository;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service("adminService")
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
    private final BoardRepository boardRepository;
    private final BoardCommentRepository boardCommentRepository;
    private final BoardReCommentRepository boardReCommentRepository;
    private final UserRepository  userRepository;
    @Override
    public AdminRespListDto getReportList() {
        AdminRespListDto adminRespListDto = new AdminRespListDto();
        List<AdminRespDto> adminRespDtoList = new ArrayList<>();
        List<Board> boardList = boardRepository.findByReportcntGreaterThan(5);
        List<Comment> commentList = boardCommentRepository.findByReportcntGreaterThan(5);
        List<Recomment> recommentList = boardReCommentRepository.findByReportcntGreaterThan(5);

        for(int i =0; i< boardList.size(); i++) {
            String formatedNow = boardList.get(i).getCreatedate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            AdminRespDto adminRespDto = new AdminRespDto(boardList.get(i).getId(),boardList.get(i).getUserid(),1,boardList.get(i).getTitle(),userRepository.findById(boardList.get(i).getUserid()).get().getNickname(),boardList.get(i).getReportcnt(),formatedNow);
            adminRespDtoList.add(adminRespDto);
        }
        for(int i =0; i< commentList.size(); i++) {
            AdminRespDto adminRespDto = new AdminRespDto(commentList.get(i).getId(),commentList.get(i).getUserid(),2,commentList.get(i).getComment(),userRepository.findById(commentList.get(i).getUserid()).get().getNickname(),commentList.get(i).getReportcnt(),commentList.get(i).getCreatedate());
            adminRespDtoList.add(adminRespDto);
        }
        for(int i =0; i< recommentList.size(); i++) {
            AdminRespDto adminRespDto = new AdminRespDto(recommentList.get(i).getId(),recommentList.get(i).getUserid(),3,recommentList.get(i).getRecomment(),userRepository.findById(recommentList.get(i).getUserid()).get().getNickname(),recommentList.get(i).getReportcnt(),recommentList.get(i).getCreatedate());
            adminRespDtoList.add(adminRespDto);
        }
        adminRespListDto.setAdminList(adminRespDtoList);
        adminRespListDto.setCnt(adminRespDtoList.size());





        return adminRespListDto;
    }

    @Override
    public void deleteReq(Long id, int category) {
        // 게시글
        if(category==1){
           boardRepository.deleteById(id);
        }
        // 댓글
        else if(category==2){
            boardCommentRepository.deleteById(id);
        }
        // 대댓글
        else if(category==3){
            boardReCommentRepository.deleteById(id);
        }

    }
}
