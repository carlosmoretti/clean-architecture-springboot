package com.poc.cleanarch.core.greeting.usecase.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.poc.cleanarch.core.greeting.Greeting;
import com.poc.cleanarch.core.greeting.exception.GreetingAlreadyExistsException;
import com.poc.cleanarch.core.greeting.ports.GreetingService;
import com.poc.cleanarch.core.greeting.usecase.CreateGreetingUseCase;

@Component
public class CreateGreetingUseCaseImpl implements CreateGreetingUseCase {
	
	@Autowired
	private GreetingService greetingService;

	@Override
	public void execute(Greeting greeting) throws GreetingAlreadyExistsException {
		if(greeting.getTitle().isEmpty())
			throw new GreetingAlreadyExistsException();
		
		greetingService.add(greeting);
	}

}
