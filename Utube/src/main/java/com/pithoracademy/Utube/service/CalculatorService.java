package com.pithoracademy.Utube.service;

public interface CalculatorService {

	int calculateSum(int num1, int num2);
	
	default int calculatePower(Integer num1, Integer power) {
		return 0;
	}
}
