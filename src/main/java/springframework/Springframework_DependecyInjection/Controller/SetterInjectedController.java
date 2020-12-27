package springframework.Springframework_DependecyInjection.Controller;

import springframework.Springframework_DependecyInjection.Services.GreetingServices;

public class SetterInjectedController {
    private GreetingServices greetingservices;

    public void setGreetingservices(GreetingServices greetingservices) {
        this.greetingservices = greetingservices;
    }

    public String getGreetings() {
        return greetingservices.sayGreeting();
    }
}

