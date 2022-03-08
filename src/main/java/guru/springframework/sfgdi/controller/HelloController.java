package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello() {
        System.out.println("Hello Spring !");
        return "Hello World !";
    }
}
