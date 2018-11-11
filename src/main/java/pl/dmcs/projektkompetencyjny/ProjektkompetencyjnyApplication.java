package pl.dmcs.projektkompetencyjny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:config/spring-config.xml")
public class ProjektkompetencyjnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektkompetencyjnyApplication.class, args);

	}
}
