package com.journaldev.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CalcService1Test {

	// 1st way to mock
	@Mock AddService addService;
	CalcService calcService;
	
	
	@BeforeEach
	public void init() {
		
		// 2nd way (alternative) way to mock
		// addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);
	}
	
	
	@Test
	void testCalc() {
		
		int num1 = 11;
		int num2 = 12;

		int mockResult = 23;
		when(addService.add(num1, num2)).thenReturn(mockResult);

		int expected = 23;
		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}
}