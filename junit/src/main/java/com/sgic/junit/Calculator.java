package com.sgic.junit;

public class Calculator {

	private CalculatorService calculatorService;
	
	public Calculator(CalculatorService calculatorService) {
		this.calculatorService=calculatorService;
	}
	
	public int add(int i, int j) {
		return calculatorService.add(i, j)*i;
		
	}
}
