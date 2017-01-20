package org.payeg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages={"org.payeg"})
public class PayEgDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayEgDemoApplication.class, args);
	}
}
