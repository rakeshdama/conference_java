package service;

import model.Speaker;
import repository.SpeakerRepository;
import repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }
}
