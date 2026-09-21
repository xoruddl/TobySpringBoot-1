package toby.springboot1;

import org.springframework.boot.SpringApplication;
import toby.config.MySpringBootApplication;

@MySpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
//		MySpringApplication.run(Springboot1Application.class, args);
		SpringApplication.run(Springboot1Application.class, args);
	}
}
