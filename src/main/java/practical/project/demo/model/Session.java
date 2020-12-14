package practical.project.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;
    private String sessionName;

    @ManyToMany
    @JoinTable(name = "sessions_speakers", joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    List<Speaker> speakers;

    public Session(){}

}
