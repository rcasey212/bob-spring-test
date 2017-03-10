package org.bob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by rcasey on 3/10/2017.
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableSwagger2
public class BobSpringApp {

	public static void main(String[] args) {

		SpringApplication.run(BobSpringApp.class, args);
	}
}
