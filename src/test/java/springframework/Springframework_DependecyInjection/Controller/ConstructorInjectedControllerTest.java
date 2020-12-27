package springframework.Springframework_DependecyInjection.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.Springframework_DependecyInjection.Services.GreetingServices;
import springframework.Springframework_DependecyInjection.Services.GreetingServicesImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServicesImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}