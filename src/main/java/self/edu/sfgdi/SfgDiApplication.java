package self.edu.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import self.edu.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(myController.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterBasedInjectController setterBasedInjectController = (SetterBasedInjectController)applicationContext.getBean("setterBasedInjectController");

		System.out.println(setterBasedInjectController.getGreeting());

		ConstructorBasedController constructorBasedController = (ConstructorBasedController)applicationContext.getBean("constructorBasedController");

		System.out.println(constructorBasedController.getGreeting());
	}

}
