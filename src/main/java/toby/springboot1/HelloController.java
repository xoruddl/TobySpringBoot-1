package toby.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("hello")
    public String hello(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is null or empty");

        return helloService.sayHello(name);
    }
}
