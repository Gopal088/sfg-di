package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.SetterServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}