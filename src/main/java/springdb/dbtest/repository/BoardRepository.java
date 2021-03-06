package springdb.dbtest.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springdb.dbtest.entity.Board;
import springdb.dbtest.entity.Comment;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {



    List<Board> findTop3ByOrderByLikecntDesc();

    //public List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);

    List<Board> findTop5ByTypeOrderByCreatedateDesc(Long type);


    //공지사항
    List<Board> findTop3ByTypeOrderByCreatedateDesc(Long type);

    //Type에 맞는 최신 게시글 10개 가져오기
    List<Board> findAllByTypeOrderByCreatedateDesc(Long type);


    @Query("select DISTINCT c from Board c join fetch c.comments where c.id = :boardid") // (1)
    List<Board> findAllWithCommentUsingFetchJoin(Long boardid);

    Long countByType(Long type);

    List<Board> findByTitleContainsIgnoreCase(String title);
    
    @Transactional
    @Modifying
    @Query("update Board b set b.likecnt = b.likecnt + 1 where b.id = :boardid")
    void plusonelike(Long boardid);

    @Transactional
    @Modifying
    @Query("update Board b set b.reportcnt = b.reportcnt + 1 where b.id = :boardid")
    void plusonereport(Long boardid);


    @Transactional
    @Modifying
    @Query("update Board b set b.commentcnt = b.commentcnt + 1 where b.id = :boardid")
    void plusonecomment(Long boardid);

    List<Board> findByUseridOrderByIdDesc(Long userid);
    List<Board> findByReportcntGreaterThan(int Reportcnt);

}
