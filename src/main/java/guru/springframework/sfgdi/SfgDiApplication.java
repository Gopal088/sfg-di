package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		HelloController hc = (HelloController) ctx.getBean("helloController");
		System.out.println(hc.sayHello());

	}

}
