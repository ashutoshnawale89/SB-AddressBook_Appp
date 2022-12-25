package com.bridgelabz.addressbook.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(AddressBookAppApplication.class, args);

		System.out.println("Welcome To The AddressBook App Project");
		log.info("Address Book App Started in {} Environment", context.getEnvironment().getProperty("environment"));
	}
}
