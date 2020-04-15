package self.edu.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.edu.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedControllerTest {

    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        constructorBasedController = new ConstructorBasedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedController.getGreeting());
    }
}