package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;

public class SetterBasedDiExample {
    HelloController helloController;

    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }

    public String getGreetings(){
        return helloController.sayHello();
    }
}
