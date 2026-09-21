package toby.springboot1;

import java.util.Objects;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;
    private final ApplicationContext applicationContext;

    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
        this.helloService = helloService;
        this.applicationContext = applicationContext;

        System.out.println("applicationContext = " + applicationContext);
    }

    @GetMapping("hello")
    public String hello(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is null or empty");

        return helloService.sayHello(name);
    }
}
