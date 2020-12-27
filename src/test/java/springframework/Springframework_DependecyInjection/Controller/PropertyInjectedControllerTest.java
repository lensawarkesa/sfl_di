package springframework.Springframework_DependecyInjection.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.Springframework_DependecyInjection.Services.GreetingServices;
import springframework.Springframework_DependecyInjection.Services.GreetingServicesImpl;

class PropertyInjectedControllerTest {
PropertyInjectedController proEnjCon;

    @BeforeEach
    void setUp() {
        proEnjCon = new PropertyInjectedController();
        proEnjCon.greetingservices = new GreetingServicesImpl();


    }

    @Test
    void getGreetings() {

        System.out.println(proEnjCon.getGreetings());
    }
}