package springframework.Springframework_DependecyInjection.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("Hello World");
        return " Hello Folks";
    }
}
