package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.BoardLike;
import springdb.dbtest.entity.BoardReport;

import javax.transaction.Transactional;

public interface BoardReportRepository extends JpaRepository<BoardReport, Long> {


    @Transactional
    @Query("select b from BoardReport b where b.userid = :userid and b.boardid = :boardid")
    BoardReport alreadyexist(Long userid, Long boardid);


    @Modifying
    @Transactional
    @Query(value = "insert into boardreport(userid,boardid) values(:userid, :boardid)", nativeQuery = true)
    void insertdata(Long userid, Long boardid);





}
