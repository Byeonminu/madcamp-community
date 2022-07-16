package springdb.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springdb.dbtest.entity.Email;
import springdb.dbtest.entity.User;

import java.util.Optional;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {



    boolean existsByEmail(String email);


}
