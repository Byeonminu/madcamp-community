package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.RecommentLike;
import springdb.dbtest.entity.RecommentReport;

import javax.transaction.Transactional;

public interface RecommentReportRepository extends JpaRepository<RecommentReport, Long> {


    @Modifying
    @Transactional
    @Query("select b from RecommentReport b where b.userid = :userid and b.recommentid = :recommentid")
    RecommentReport alreadyexist(Long userid, Long recommentid);


    @Modifying
    @Transactional
    @Query(value = "insert into RecommentReport values(0L, :userid, :recommentid)", nativeQuery = true)
    void insertdata(Long userid, Long recommentid);





}
