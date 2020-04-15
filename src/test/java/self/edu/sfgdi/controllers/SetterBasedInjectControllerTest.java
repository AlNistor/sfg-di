package self.edu.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.edu.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedInjectControllerTest {
    SetterBasedInjectController setterBasedInjectController;

    @BeforeEach
    void setUp() {
        setterBasedInjectController = new SetterBasedInjectController();
        setterBasedInjectController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedInjectController.getGreeting());
    }
}