package springframework.Springframework_DependecyInjection.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.Springframework_DependecyInjection.Services.GreetingServices;
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServices greetingservices;

    public String getGreetings(){
        return greetingservices.sayGreeting();
    }

}
