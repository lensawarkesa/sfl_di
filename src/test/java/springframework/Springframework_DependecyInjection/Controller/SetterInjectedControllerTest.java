package springframework.Springframework_DependecyInjection.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.Springframework_DependecyInjection.Services.GreetingServicesImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingservices(new GreetingServicesImpl());

    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}