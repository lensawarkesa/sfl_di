package springframework.Springframework_DependecyInjection.Controller;

import springframework.Springframework_DependecyInjection.Services.GreetingServices;

public class ConstructorInjectedController {
    private final GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
