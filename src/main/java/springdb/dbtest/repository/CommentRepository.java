package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {



    List<Comment> findAllByBoard(Long boardid);

//    @Query("select DISTINCT c from Comment c join fetch c.board ") // (1)
//    List<Comment> findAllComments();


}
