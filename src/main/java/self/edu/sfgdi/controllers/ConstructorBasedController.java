package self.edu.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import self.edu.sfgdi.services.GreetingService;

@Controller
public class ConstructorBasedController {

    private final GreetingService greetingService;

    public ConstructorBasedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
