import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.SpeakerRepository;
import repository.SpeakerRepositoryImpl;
import service.SpeakerService;
import service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new SpeakerRepositoryImpl();
    }
}
