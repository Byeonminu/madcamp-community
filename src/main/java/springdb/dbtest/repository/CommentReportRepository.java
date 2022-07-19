package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.CommentLike;
import springdb.dbtest.entity.CommentReport;

import javax.transaction.Transactional;

public interface CommentReportRepository extends JpaRepository<CommentReport, Long> {


    @Transactional
    @Query("select b from CommentReport b where b.userid = :userid and b.commentid = :commentid")
    CommentReport alreadyexist(Long userid, Long commentid);


    @Modifying
    @Transactional
    @Query(value = "insert into commentreport(userid,commentid) values( :userid, :commentid)", nativeQuery = true)
    void insertdata(Long userid, Long commentid);





}
