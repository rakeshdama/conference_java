package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Rakesh");
        speaker.setLastName("Dama");

        speakers.add(speaker);

        return speakers;
    }
}
