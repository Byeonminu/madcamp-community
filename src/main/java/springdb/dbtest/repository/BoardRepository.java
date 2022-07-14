package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdb.dbtest.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
