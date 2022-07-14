package springdb.dbtest.service;

import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;

public interface BoardService {

    // 보드 객체 추가
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto);

}
