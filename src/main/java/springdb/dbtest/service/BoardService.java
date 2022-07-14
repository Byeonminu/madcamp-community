package springdb.dbtest.service;

import org.hibernate.engine.jdbc.Size;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;

import java.util.List;

public interface BoardService {

    // 보드 객체 추가
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto);
    // info 보드 3개 받아오기
//    public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);

}
