package swapi.springboot.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SwapiSpringbootLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiSpringbootLabApplication.class, args);
	}

}
