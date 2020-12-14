package practical.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import practical.project.demo.model.Speaker;
import practical.project.demo.repository.SpeakerRepository;
import practical.project.demo.service.SpeakerService;

import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {

    @Autowired
    SpeakerService speakerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Speaker> findAllSpeakers(){
        return speakerService.getAllSpeakers();
    }

    @RequestMapping(value = "/{speaker_id}", method = RequestMethod.GET)
    public Speaker getSpeakerById(@PathVariable("speaker_id") Long id){
        return speakerService.getSpeakerById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Speaker createSpeaker(@RequestBody Speaker speaker){
        return speakerService.createSpeaker(speaker);
    }

    //@DeleteMapping
    @RequestMapping(value = "/{speaker_id}",method = RequestMethod.DELETE)
    public void deleteSpeakerById(@PathVariable("speaker_id") Long id){
        speakerService.deleteSpeakerById(id);
    }
}
