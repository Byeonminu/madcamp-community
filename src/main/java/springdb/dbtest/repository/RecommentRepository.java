package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import springdb.dbtest.entity.Comment;
import springdb.dbtest.entity.Recomment;

import javax.transaction.Transactional;
import java.util.List;

public interface RecommentRepository extends JpaRepository<Recomment, Long> {





    @Transactional
    @Modifying
    @Query("update Recomment b set b.recomlikecnt = b.recomlikecnt + 1 where b.id = :recommentid")
    void plusonelike(Long recommentid);

    @Transactional
    @Modifying
    @Query("update Recomment b set b.reportcnt = b.reportcnt + 1 where b.id = :recommentid")
    void plusonereport(Long recommentid);


}
