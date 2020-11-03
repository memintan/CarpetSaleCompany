package com.company;

import com.company.calculator.Calculator;
import com.company.enums.Cities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetAreaPriceCalApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext container = SpringApplication.run(CarpetAreaPriceCalApplication.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println("calculator.getTotalCarpetCost(Cities.AUSTIN) = " + calculator.getTotalCarpetCost(Cities.AUSTIN));
	}

}
