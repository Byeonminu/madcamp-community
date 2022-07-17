package springdb.dbtest.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardCommentRespDto;
import springdb.dbtest.dto.BoardRecommentRespDto;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.entity.Recomment;
import springdb.dbtest.repository.BoardCommentRepository;
import springdb.dbtest.repository.BoardReCommentRepository;
import springdb.dbtest.repository.BoardRepository;
import springdb.dbtest.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("boardService")
public class BoardServiceImpl implements BoardService {
    private final UserRepository userRepository;
    private final BoardRepository boardRepository;
    private final BoardCommentRepository boardCommentRepository;
    private final BoardReCommentRepository boardReCommentRepository;

    @Override
    public List<Board> getBest3board() {
        return boardRepository.findTop3ByOrderByLikecntDesc();
    }

    @Override
    public List<Board> get5Boardbytype(Long type) {
        return boardRepository.findTop5ByTypeOrderByCreatedateDesc(type);
    }

//
//    public List<Board> getInfo5board(Long type) {
//
//        return boardRepository.findTop5ByTypeOrderByCreatedateDesc(type);
//    }

    @Override
    public List<Board> getnoti3board(Long type) {
        return boardRepository.findTop3ByTypeOrderByCreatedateDesc(type);
    }


    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto) {
        Board board = boardReqDto.toEntity();

        return boardRepository.save(board).toDto();
    }

    @Override
    public List<Board> get10latestboard(Long type, int pagenumber) {
        List<Board> alllist = boardRepository.findAllByTypeOrderByCreatedateDesc(type);
        List<Board> ret = alllist.subList((pagenumber-1) * 10, Math.min(pagenumber * 10, alllist.size()));
        return ret;
    }

    @Override
    public Optional<Board> getOneboardbyid(Long id) {
        return boardRepository.findById(id);
    }

    @Override
    public List<Board> findAllWithCommentUsingFetchJoin(Long Boardid) {
        return boardRepository.findAllWithCommentUsingFetchJoin(Boardid);
    }

    @Override
    public Long getBoardcount(Long type) {
        return boardRepository.countByType(type);
    }

    @Override
    public BoardRespDto getBoardDetail(Long id) {
        BoardRespDto boardRespDto = boardRepository.findById(id).get().toDto();
        return boardRespDto;
    }

    @Override
    public List<BoardCommentRespDto> getCommentListByBoardId(Long boardId) {
        List<Comment> commentList = boardCommentRepository.findByBoard_IdOrderByIdAsc(boardId);
        System.out.println("리스트!!!!!!!!!!!!"+commentList);
//        System.out.println("리스트!!!!!!!!!!!!"+commentList);
//        System.out.println("닉네임!!!!!!!!!!!!"+commentList.get(0).getUserid());
//        List<BoardCommentRespDto> boardCommentList = new ArrayList<>();
//        for(int i=0; i<commentList.size(); i++){
//
//            BoardCommentRespDto boardCommentRespDto = new BoardCommentRespDto();
//            boardCommentRespDto.setId(commentList.get(i).getId());
//            boardCommentRespDto.setNickname(userRepository.findById(commentList.get(i).getUserid()).get().getNickname());
//            boardCommentRespDto.setPicture(userRepository.findById(commentList.get(i).getUserid()).get().getPicture());
//            boardCommentRespDto.setComment(commentList.get(i).getComment());
//            boardCommentRespDto.setComlikecnt(commentList.get(i).getComlikecnt());
//            boardCommentRespDto.setRecommentcnt(commentList.get(i).getRecomments().size());
//            boardCommentList.add(boardCommentRespDto);
//        }
        return null;
    }

    @Override
    public List<BoardRecommentRespDto> getRecommentListByCommentId(Long commentId) {
        List<Recomment> recommentList = boardReCommentRepository.findByCommentIdOrderByIdAsc(commentId);
        List<BoardRecommentRespDto> recommentRespDtoList = new ArrayList<>();
        for(int i=0 ;i<recommentList.size(); i++){
            BoardRecommentRespDto boardRecommentRespDto = new BoardRecommentRespDto();
            boardRecommentRespDto.setId(recommentList.get(i).getId());
            boardRecommentRespDto.setNickname(userRepository.findById(recommentList.get(i).getUserid()).get().getNickname());
            boardRecommentRespDto.setPicture(userRepository.findById(recommentList.get(i).getUserid()).get().getPicture());
            boardRecommentRespDto.setRecomment(recommentList.get(i).getRecomment());
            boardRecommentRespDto.setRecomlikecnt(recommentList.get(i).getRecomlikecnt());
            recommentRespDtoList.add(boardRecommentRespDto);
        }
        return recommentRespDtoList;
    }

}
