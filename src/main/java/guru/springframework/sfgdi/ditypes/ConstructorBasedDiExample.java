package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;

public class ConstructorBasedDiExample {
    HelloController helloController;

    public ConstructorBasedDiExample(HelloController helloController) {
        this.helloController = helloController;
    }

    public String getGreeting() {
        return helloController.sayHello();
    }
}
