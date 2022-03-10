package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedDiExampleTest {

    SetterBasedDiExample setterBasedDiExample;

    @BeforeEach
    void setUp() {
        setterBasedDiExample = new SetterBasedDiExample();
        setterBasedDiExample.setHelloController(new HelloController());
    }

    @Test
    void getGreetings() {
        System.out.println(setterBasedDiExample.getGreetings());
    }
}