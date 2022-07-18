package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdb.dbtest.entity.Comment;

import java.util.List;

public interface BoardCommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoard_IdOrderByIdAsc(Long board_Id);
    List<Comment> findByUseridOrderByIdDesc(Long userid);
}
