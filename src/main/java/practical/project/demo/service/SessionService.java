package practical.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practical.project.demo.model.Session;
import practical.project.demo.repository.SessionRepository;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    //findAllSessions
    public List<Session> findAllSessions(){
        return sessionRepository.findAll();
    }

    //getSessionById
    public Session getSessionById(Long id){
        return sessionRepository.findById(id).get();
    }

    //create sau add session
    public Session createSession(Session newSession){
        return sessionRepository.saveAndFlush(newSession);
    }

    //delete dupa Id
    public void deleteSessiobById(Long id){
        sessionRepository.deleteById(id);
    }


}
