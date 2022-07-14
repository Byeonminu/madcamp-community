package springdb.dbtest.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import springdb.dbtest.entity.Board;
import springdb.dbtest.repository.BoardRepository;

import java.util.List;

@RequiredArgsConstructor
@Service("boardService")
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public List<Board> getGeneration14Board() {
        return boardRepository.findTop3ByOrderByLikecntDesc();
    }
}
