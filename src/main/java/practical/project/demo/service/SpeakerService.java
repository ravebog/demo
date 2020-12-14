package practical.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practical.project.demo.model.Speaker;
import practical.project.demo.repository.SpeakerRepository;

import java.util.List;

@Service
public class SpeakerService {

    @Autowired
    SpeakerRepository speakerRepository;

    //findAllSpeakers
    public List<Speaker> getAllSpeakers(){
        return speakerRepository.findAll();
    }

    //findSpeakerById
    public Speaker getSpeakerById(Long id){
        return speakerRepository.findById(id).get();
    }

    //createSpeaker
    public Speaker createSpeaker(Speaker speaker){
        return speakerRepository.saveAndFlush(speaker);
    }

    //deleteById
    public void deleteSpeakerById(Long id){
        speakerRepository.deleteById(id);
    }
}
