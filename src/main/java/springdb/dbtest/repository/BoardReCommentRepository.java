package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdb.dbtest.entity.Recomment;

import java.util.List;

public interface BoardReCommentRepository extends JpaRepository<Recomment, Long> {
    List<Recomment> findByCommentIdOrderByIdAsc(Long commentId);
}
