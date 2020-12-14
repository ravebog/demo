package practical.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practical.project.demo.model.Session;
import practical.project.demo.service.SessionService;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    SessionService sessionService;

    //GET endpoint to retrive all te sessions

    @GetMapping
    public List<Session> findAllSessions() {
        return sessionService.findAllSessions();
    }

    //GET endpoint to retrive a session by Id
    @GetMapping("/{session_id}")
    //@RequestMapping("/{session_id}")
    public Session findSessionById(@PathVariable("session_id") Long id) {
        return sessionService.getSessionById(id);
    }

    //POST endpoint to create a new session
    @PostMapping
    public Session addSession(@RequestBody Session session) {
        return sessionService.createSession(session);
    }

    //Delete endpoint to delete a new session
    @DeleteMapping
    @RequestMapping("/{session_id}")
    public void deleteSessionById(@PathVariable("session_id") Long id) {
        sessionService.deleteSessiobById(id);
    }
}
