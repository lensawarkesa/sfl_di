package springframework.Springframework_DependecyInjection;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.Springframework_DependecyInjection.Controller.MyController;
import springframework.Springframework_DependecyInjection.Controller.PropertyInjectedController;

@SpringBootApplication
public class SpringframeworkDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringframeworkDependencyInjectionApplication.class, args);
		MyController mycontroller = (MyController) ctx.getBean("myController");
		String greeting = mycontroller.helloWorld();
		System.out.println(greeting);
		System.out.println("-------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());
	}

}
