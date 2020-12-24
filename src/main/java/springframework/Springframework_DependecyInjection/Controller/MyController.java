package springframework.Springframework_DependecyInjection.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("hello world");
        return " Hello Folks";
    }
}
