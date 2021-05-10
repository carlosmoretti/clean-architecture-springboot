package com.poc.cleanarch.infrastructure.controller.greeting.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.cleanarch.core.greeting.Greeting;
import com.poc.cleanarch.core.greeting.exception.GreetingAlreadyExistsException;
import com.poc.cleanarch.core.greeting.usecase.CreateGreetingUseCase;
import com.poc.cleanarch.infrastructure.controller.greeting.GreetingController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingControllerImpl implements GreetingController {
	
	@Autowired
	CreateGreetingUseCase createGreetingUsecase;

	@Override
	@GetMapping
	public List<Greeting> getAll() {
		
		Greeting mock = new Greeting(0L, "Teste", new Date());
		
		// TODO Auto-generated method stub
		try {
			createGreetingUsecase.execute(mock);
		} catch(GreetingAlreadyExistsException ex) {
			ex.printStackTrace();
		}
		
		return new ArrayList<Greeting>();
	}

	@Override
	@PostMapping
	public void post(Greeting obj) {
		try {
			createGreetingUsecase.execute(obj);
		} catch(GreetingAlreadyExistsException ex) {
			ex.printStackTrace();
		}
	}

}
