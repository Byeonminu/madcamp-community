package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.CommentLike;

import javax.transaction.Transactional;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {


    @Modifying
    @Transactional
    @Query("select b from CommentLike b where b.userid = :userid and b.commentid = :commentid")
    CommentLike alreadyexist(Long userid, Long commentid);


    @Modifying
    @Transactional
    @Query(value = "insert into CommentLike values(0L, :userid, :commentid)", nativeQuery = true)
    void insertdata(Long userid, Long commentid);





}
