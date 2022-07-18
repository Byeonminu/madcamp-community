package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.User;
import springdb.dbtest.entity.ViewCnt;

import javax.swing.text.View;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ViewCntRepository extends JpaRepository<ViewCnt, Long> {
    boolean existsByDate(String today);

    @Transactional
    @Modifying
    @Query("update ViewCnt v set v.cnt = v.cnt +1 where v.date = :today")
    void updateView(String today);

    ViewCnt findByDate(String today);

}
