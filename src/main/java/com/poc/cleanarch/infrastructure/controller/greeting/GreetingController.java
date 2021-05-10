package com.poc.cleanarch.infrastructure.controller.greeting;

import java.util.List;
import com.poc.cleanarch.core.greeting.Greeting;

public interface GreetingController {
	List<Greeting> getAll();
	void post(Greeting obj);
}
