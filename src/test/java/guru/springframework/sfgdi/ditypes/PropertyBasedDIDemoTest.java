package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedDIDemoTest {

    PropertyBasedDIDemo propertyBasedDIDemo;

    @BeforeEach
    void setUp() {
        propertyBasedDIDemo = new PropertyBasedDIDemo();
        propertyBasedDIDemo.helloController = new HelloController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGreetings() {
        System.out.println(propertyBasedDIDemo.getGreetings());
    }
}