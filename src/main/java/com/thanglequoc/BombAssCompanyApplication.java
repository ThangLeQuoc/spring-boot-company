package com.thanglequoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.thanglequoc.employee.EmployeeController;

@SpringBootApplication
public class BombAssCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BombAssCompanyApplication.class, args);
	}
	
	
}
