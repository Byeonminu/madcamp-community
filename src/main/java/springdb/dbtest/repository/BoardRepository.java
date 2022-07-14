package springdb.dbtest.repository;

import org.hibernate.engine.jdbc.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import springdb.dbtest.entity.Board;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    //public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);
}
