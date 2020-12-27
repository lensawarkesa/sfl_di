package springframework.Springframework_DependecyInjection.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
