package springdb.dbtest.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.engine.jdbc.Size;
import org.springframework.stereotype.Service;
import springdb.dbtest.dto.BoardReqDto;
import springdb.dbtest.dto.BoardRespDto;
import springdb.dbtest.entity.Board;
import springdb.dbtest.repository.BoardRepository;

import java.util.List;

@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@Service("boardService")
public class BoardServiceImpl implements BoardService{
    private final BoardRepository boardRepository;
    @Override
    public BoardRespDto insertBoardInfo(BoardReqDto boardReqDto) {
        Board board = boardReqDto.toEntity();

        return boardRepository.save(board).toDto();
    }

//    @Override
//    public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type) {
//
//        return boardRepository.findTop3ByTypeOrderByCreatedateDesc(type);
//    }
}
