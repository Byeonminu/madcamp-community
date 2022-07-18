package springdb.dbtest.service;

import springdb.dbtest.dto.BoardCommentRespDto;
import springdb.dbtest.dto.BoardRecommentRespDto;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface BoardService {

    //Best 3 board
    public List<Board> getBest3board();

    // 보드 객체 추가
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto);
    //공지사항 3개 받아오기 ( 최신순 )
    public List<Board> getnoti3board(Long type);

    //type에 따라 최신글 5개 가져오기
    public List<Board> get5Boardbytype(Long type);

    //최신 10개
    public List<Board> get10latestboard(Long type, int pagenumber);

    public Optional<Board> getOneboardbyid(Long id);

    public List<Board> findAllWithCommentUsingFetchJoin(Long boardid);

    public Long getBoardcount(Long type);
    public BoardRespDto getBoardDetail(Long id);

    public List<BoardCommentRespDto> getCommentListByBoardId(Long boardId);
    public List<BoardRecommentRespDto> getRecommentListByCommentId(Long commentId);

}
