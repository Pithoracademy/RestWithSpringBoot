package com.pithoracademy.Utube.service.impl;

import org.springframework.stereotype.Service;

import com.pithoracademy.Utube.service.CalculatorService;

// @Service("advanceCalculatorService")
public class AdvanceCalculatorServiceImpl implements CalculatorService {

	@Override
	public int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int calculatePower(Integer num1, Integer power) {
		return (int) Math.pow(num1.doubleValue(), power.doubleValue());
	}
}
