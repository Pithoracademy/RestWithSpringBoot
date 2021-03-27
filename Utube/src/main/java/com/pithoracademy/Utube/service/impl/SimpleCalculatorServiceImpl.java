package com.pithoracademy.Utube.service.impl;

import org.springframework.stereotype.Service;

import com.pithoracademy.Utube.service.CalculatorService;

// @Service("simpleCalculatorService")
public class SimpleCalculatorServiceImpl implements CalculatorService{

	@Override
	public int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

}
