package practical.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practical.project.demo.model.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker,Long> {

}
