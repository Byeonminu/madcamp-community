package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.RecommentLike;

import javax.transaction.Transactional;

public interface RecommentLikeRepository extends JpaRepository<RecommentLike, Long> {


    @Transactional
    @Query("select b from RecommentLike b where b.userid = :userid and b.recommentid = :recommentid")
    RecommentLike alreadyexist(Long userid, Long recommentid);


    @Modifying
    @Transactional
    @Query(value = "insert into recommentlike(userid,recommentid) values( :userid, :recommentid)", nativeQuery = true)
    void insertdata(Long userid, Long recommentid);





}
