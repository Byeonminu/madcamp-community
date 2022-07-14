package springdb.dbtest.service;

import lombok.Data;
import springdb.dbtest.entity.Board;

import java.util.List;

public interface BoardService {

    public List<Board> getGeneration14Board();

}
