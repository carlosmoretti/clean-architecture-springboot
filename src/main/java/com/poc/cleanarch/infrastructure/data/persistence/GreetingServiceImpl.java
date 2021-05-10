package com.poc.cleanarch.infrastructure.data.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.cleanarch.core.greeting.Greeting;
import com.poc.cleanarch.core.greeting.ports.GreetingService;
import com.poc.cleanarch.infrastructure.data.model.GreetingModel;
import com.poc.cleanarch.infrastructure.mapper.greeting.GreetingMapping;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	@Autowired
	GreetingMapping greetingMapping;

	@Override
	public List<Greeting> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Greeting get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Greeting obj) {
		GreetingModel model = greetingMapping.toDto(obj);
		System.out.println(model.getTitulo());
	}

	@Override
	public void update(Greeting obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Greeting obj) {
		// TODO Auto-generated method stub
		
	}

}
