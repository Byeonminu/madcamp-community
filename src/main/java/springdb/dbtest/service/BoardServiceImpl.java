package springdb.dbtest.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.repository.BoardRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("boardService")
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public List<Board> getBest3board() {
        return boardRepository.findTop3ByOrderByLikecntDesc();
    }

    @Override
    public List<Board> getGeneration14(Long type) {
        return boardRepository.findTop5ByTypeOrderByCreatedateDesc(type);
    }

 
    public List<Board> getInfo5board(Long type) {

        return boardRepository.findTop5ByTypeOrderByCreatedateDesc(type);
    }

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
}
