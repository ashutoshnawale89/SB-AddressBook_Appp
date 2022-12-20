package com.bridgelabz.EmployeePayrollApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(EmployeePayrollAppApplication.class, args);
		System.out.println("Welcome To The Employee PayRoll App Project");
		log.info("Employee Payroll App Started in {} Environment", context.getEnvironment().getProperty("environment"));
	}
}
