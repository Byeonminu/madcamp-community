package springdb.dbtest.service;

import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {

    //Best 3 board
    public List<Board> getBest3board();

    // 보드 객체 추가
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto);
    // info 보드 5개 받아오기
    public List<Board> getInfo5board(Long type);
    //공지사항 3개 받아오기 ( 최신순 )
    public List<Board> getnoti3board(Long type);

    public List<Board> getGeneration14(Long type);

    //최신 10개
    public List<Board> get10latestboard(Long type);

    public Optional<Board> getOneboardbyid(Long id);

}
