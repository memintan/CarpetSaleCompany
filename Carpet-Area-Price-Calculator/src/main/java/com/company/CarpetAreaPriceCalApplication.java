package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetAreaPriceCalApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(CarpetAreaPriceCalApplication.class, args);
	}

}
