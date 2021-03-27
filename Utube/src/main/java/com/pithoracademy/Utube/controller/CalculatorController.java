package com.pithoracademy.Utube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pithoracademy.Utube.service.CalculatorService;

// @RestController
// @RequestMapping("/calculate")
public class CalculatorController {
	
	// Filed injection 
 	@Autowired
// 	@Qualifier("simpleCalculatorService") 
	private CalculatorService calculatorService;
	
	// we'll inject the dependency here
	
//	@Autowired
//	public void setCalculatorService(@Qualifier("advanceCalculatorService")  CalculatorService  calculatorService) {
//		this.calculatorService = calculatorService;
//	}
//	
	// constructor injection
//	@Autowired
//	public CalculatorController(@Qualifier("simpleCalculatorService") CalculatorService calculatorService) {
//		super();
//		this.calculatorService = calculatorService;
//	}

//	@GetMapping("/sum/{num1}/{num2}")
//	public String calculateSum(@PathVariable Integer num1, @PathVariable Integer num2) {
//		Integer sum = calculatorService.calculateSum(num1, num2);
//		
//		return "Sum of " + num1 + " and " + num2 + " is : " + sum;
//	}
//	
//	@GetMapping("/power/{num1}/{power}")
//	public String calculatePower(@PathVariable Integer num1, @PathVariable Integer power) {
//		Integer val = calculatorService.calculatePower(num1, power);
//		
//		return power + " Power of " + num1 + " is : " + val;
//	}
}
