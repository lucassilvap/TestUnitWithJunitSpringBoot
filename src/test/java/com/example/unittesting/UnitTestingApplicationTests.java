package com.example.unittesting;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.unittesting.exception.TheDivisorCanNotBeZeroException;
import com.example.unittesting.service.CalculateService;

@SpringBootTest
class UnitTestingApplicationTests {
	
	@Autowired 
	private CalculateService calculaterService;
	
	@Test
	public void shouldReturnZeroWhenNoValueGiven() {	
	 int sum = calculaterService.sumIntegers();
	 assertEquals(0, sum);
	}
	
	@Test
	public void shouldReturnSumBetwenTheGivenValue() {	
	 int sum = calculaterService.sumIntegers(1,2,3);
	 assertEquals(6, sum);
	}
	
	/*
	 * Test that must return error;
	@Test
	public void mustReturnFail() {
		int sum = calculaterService.sumIntegers(1,2);
		assertEquals(1, sum);
	}
	*/
	
	@Test
	public void shouldReturnDivisionBetwenGivenValue() {
	 int divide = calculaterService.divide(10, 2);
	 assertEquals(5, divide);
	}
	
	@Test
	public void shouldThrowExceptionWhenTheSecondValueOfDivisionIsZero() {
		
	  TheDivisorCanNotBeZeroException theDivisorcanNotBeZeroException = 		  
	  Assertions.assertThrows(TheDivisorCanNotBeZeroException.class, 
	  ()-> calculaterService.divide(10, 0));
	  
	  String messageException = theDivisorcanNotBeZeroException.getReason();
	  assertEquals("The divisor can not to be zero",
	  messageException);
	}
	
	@Test
	public void shouldReturnTheDivisionBetwenGivenNumber() {
		assertEquals(calculaterService.divide(10, 2), 5);
	}
		
}
