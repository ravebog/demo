package practical.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practical.project.demo.model.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {

}
