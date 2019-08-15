package com.sgic.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;


public class TestCalculator {

	Calculator cal = null;
	
//	CalculatorService calculatorService = new CalculatorService() {
//		
//		public int add(int i, int j) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
	
	// Using Mockito Tool
	CalculatorService calculatorService = mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		cal = new Calculator(calculatorService);
	}
	
	@Test
	public void add() {

		when(calculatorService.add(2,3)).thenReturn(5);
		assertEquals(10,cal.add(2,3));
	}
}
