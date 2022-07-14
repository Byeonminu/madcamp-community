package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.Jongmin;

@Repository
public interface TestRepository extends JpaRepository<Jongmin,Long> {

}
