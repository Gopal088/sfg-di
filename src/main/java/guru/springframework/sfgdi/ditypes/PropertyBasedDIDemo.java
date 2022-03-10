package guru.springframework.sfgdi.ditypes;

import guru.springframework.sfgdi.controller.HelloController;

public class PropertyBasedDIDemo {

    HelloController helloController;

    public String getGreetings() {
        return helloController.sayHello();
    }

}
