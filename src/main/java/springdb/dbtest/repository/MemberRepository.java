package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.Memo;

@Repository
public interface MemberRepository extends JpaRepository<Memo, Long> {

}