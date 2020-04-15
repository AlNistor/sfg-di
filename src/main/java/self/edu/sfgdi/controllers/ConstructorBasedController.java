package self.edu.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import self.edu.sfgdi.services.GreetingService;

@Controller
public class ConstructorBasedController {

    private final GreetingService greetingService;

    public ConstructorBasedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
