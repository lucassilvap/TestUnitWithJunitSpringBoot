package com.example.unittesting.service;

import org.springframework.stereotype.Service;

import com.example.unittesting.exception.TheDivisorCanNotBeZeroException;


@Service
public class CalculateService {
  
	public int sumIntegers(int ... numbers) {
		 int sum = 0;
		 if(numbers.length > 0)
		 for(int number : numbers) sum += number;
	     return sum;
    }
	
	public int divide(int a , int b) {
		if(b == 0) throw new TheDivisorCanNotBeZeroException(); 
		return a / b;
	}
	
}
