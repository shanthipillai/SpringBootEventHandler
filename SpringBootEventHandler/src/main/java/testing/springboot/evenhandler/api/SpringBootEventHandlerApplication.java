package testing.springboot.evenhandler.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootEventHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventHandlerApplication.class, args);
	}

}
