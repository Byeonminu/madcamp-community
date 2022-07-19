package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.BoardLike;

import javax.transaction.Transactional;

public interface BoardLikeRepository extends JpaRepository<BoardLike, Long> {

    @Transactional
    @Query("select b from BoardLike b where b.userid = :userid and b.boardid = :boardid")
    BoardLike alreadyexist(Long userid, Long boardid);


    @Modifying
    @Transactional
    @Query(value = "insert into boardlike (userid, boardid) values(:userid, :boardid)", nativeQuery = true)
    void insertdata(Long userid, Long boardid);





}
