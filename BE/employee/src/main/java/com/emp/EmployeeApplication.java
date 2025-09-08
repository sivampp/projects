package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication(exclude = {
//	    SecurityConfig.class,
//	    UserConfig.class
//	})

@SpringBootApplication
@ComponentScan("com.emp")
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
