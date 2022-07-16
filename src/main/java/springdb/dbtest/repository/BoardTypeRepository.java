package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.BoardType;

import java.util.List;

public interface BoardTypeRepository extends JpaRepository<BoardType, Long> {
    List<BoardType> findAllByOrderByIdAsc();
}
