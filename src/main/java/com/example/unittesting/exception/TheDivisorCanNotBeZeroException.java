package com.example.unittesting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TheDivisorCanNotBeZeroException extends ResponseStatusException{

	public TheDivisorCanNotBeZeroException() {
		super(HttpStatus.BAD_REQUEST, "The divisor can not to be zero");
	}


}
