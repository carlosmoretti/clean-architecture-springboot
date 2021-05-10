package com.poc.cleanarch.core.greeting.usecase;

import com.poc.cleanarch.core.greeting.Greeting;
import com.poc.cleanarch.core.greeting.exception.GreetingAlreadyExistsException;

public interface CreateGreetingUseCase {
	void execute(Greeting greeting) throws GreetingAlreadyExistsException;
}
