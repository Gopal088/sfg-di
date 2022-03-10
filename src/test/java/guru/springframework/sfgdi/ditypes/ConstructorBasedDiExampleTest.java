package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedDiExampleTest {

    ConstructorBasedDiExample constructorBasedDiExample;

    @BeforeEach
    void setUp() {
        constructorBasedDiExample = new ConstructorBasedDiExample(new HelloController());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedDiExample.getGreeting());
    }
}