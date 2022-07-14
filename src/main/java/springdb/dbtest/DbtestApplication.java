package springdb.dbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DbtestApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {

		SpringApplication.run(DbtestApplication.class, args);
	}

}
