package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardLIstRespDto;
import springdb.dbtest.dto.MyProfileCommentRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.repository.BoardCommentRepository;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.CommentRepository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service("myProfileService")
public class MyProfileServiceImpl implements MyProfileService{

    private final BoardRepository boardRepository;
    private final BoardCommentRepository boardCommentRepository;
    @Override
    public MyProfileCommentRespDto getMyComments(Long userid, int pagenum) {
        System.out.println(userid+"  여기여기 "+pagenum);
        MyProfileCommentRespDto myProfileCommentRespDto = new MyProfileCommentRespDto();
        List<Comment> commentList = boardCommentRepository.findByUseridOrderByIdDesc(userid);
        List<Comment> commentListTemp = new ArrayList<>();
        int startNum = (pagenum-1) * 3;
        int endNum;
        if(commentList.size() % 3 == 0) {
            endNum = (startNum+1) * 3;
        }else {
            if((commentList.size()-startNum) > 3) {
                endNum = startNum+3;
            }else {
                endNum = startNum + (commentList.size() % 3);
            }
        }
        System.out.println("start : "+startNum+" end : "+endNum + " total : "+commentList.size());
        for(int i=startNum; i<endNum; i++){
            System.out.println(i);
            commentListTemp.add(commentList.get(i));
        }

        myProfileCommentRespDto.setCommentList(commentListTemp);
        myProfileCommentRespDto.setCnt(commentList.size());
        return myProfileCommentRespDto;
    }

    @Override
    public BoardLIstRespDto getMyBoard(Long userid, int pagenum) {
        BoardLIstRespDto boardLIstRespDto = new BoardLIstRespDto();
        List<Board> boardList = boardRepository.findByUseridOrderByIdDesc(userid);
        List<Board> boardListTemp = new ArrayList<>();
        int startNum = (pagenum-1) * 3;
        int endNum;
        if(boardList.size() % 3 == 0) {
            endNum = (startNum+1) * 3;
        }else {
            if((boardList.size()-startNum) > 3) {
                endNum = startNum+3;
            }else {
                endNum = startNum + boardList.size() % 3;
            }
        }
        System.out.println("start : "+startNum+" end : "+endNum + " total : "+boardList.size());
        for(int i=startNum; i<endNum; i++){
            System.out.println(i);
            boardListTemp.add(boardList.get(i));
        }
        boardLIstRespDto.setBoardList(boardListTemp);
        boardLIstRespDto.setCnt(boardList.size());
        return boardLIstRespDto;
    }
}
