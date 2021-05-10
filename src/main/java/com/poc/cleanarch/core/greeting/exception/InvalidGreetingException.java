package com.poc.cleanarch.core.greeting.exception;

public class InvalidGreetingException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidGreetingException(String message) {
		super(message);
	}
}
