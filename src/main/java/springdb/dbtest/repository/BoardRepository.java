package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdb.dbtest.entity.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {


    List<Board> findAllByType(Long Type);

    List<Board> findTop3ByOrderByLikecntDesc();
    //public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);
}
