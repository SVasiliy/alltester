package alltester;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableAutoConfiguration
public class Example {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Example.class, args);

	}

}
