package com.familyfirstsoftware.primeNumberValidator;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NumberValidatorTests {
	NumberValidator validator;

	@Before
	public void setup(){
		validator = new NumberValidator();
	}

	
	@Test
	public void checkPrimeNumbers() 
	{
		Integer numbers[] = {1,23,61,79};
		
		for (int i = 0; i < numbers.length; i++) {
			assertEquals(true,validator.isItPrime(numbers[i]));
		}
		
	}
	
	
	@Test
	public void checkNonPrimeNumbers() 
	{
		Integer numbers[] = {15,25,60,63,207};
		
		for (int i = 0; i < numbers.length; i++) {
			assertEquals(false,validator.isItPrime(numbers[i]));
		}
	}
	
	

}
