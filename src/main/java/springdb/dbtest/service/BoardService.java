package springdb.dbtest.service;

import lombok.Data;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;

import java.util.List;

public interface BoardService {

    //Best 3 board
    public List<Board> getBest3board();

    // 보드 객체 추가
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto);
    // info 보드 3개 받아오기
    public List<Board> findTop5ByTypeOrderByCreatedateDesc(Long type);
    //공지사항 3개 받아오기 ( 최신순 )
    public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);

    public List<Board> getGeneration14(Long type);

}
