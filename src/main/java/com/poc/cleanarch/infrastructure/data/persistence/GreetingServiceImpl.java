package com.poc.cleanarch.infrastructure.data.persistence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.cleanarch.core.greeting.Greeting;
import com.poc.cleanarch.core.greeting.ports.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

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
		// TODO Auto-generated method stub
		
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
