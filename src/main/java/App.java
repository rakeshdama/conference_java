import service.SpeakerService;
import service.SpeakerServiceImpl;

public class App {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
