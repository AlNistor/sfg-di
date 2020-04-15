package self.edu.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import self.edu.sfgdi.controllers.ConstructorBasedController;
import self.edu.sfgdi.controllers.MyController;
import self.edu.sfgdi.controllers.PropertyInjectedController;
import self.edu.sfgdi.controllers.SetterBasedInjectController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterBasedInjectController setterBasedInjectController = (SetterBasedInjectController)applicationContext.getBean("setterBasedInjectController");

		System.out.println(setterBasedInjectController.getGreeting());

		ConstructorBasedController constructorBasedController = (ConstructorBasedController)applicationContext.getBean("constructorBasedController");

		System.out.println(constructorBasedController.getGreeting());
	}

}
