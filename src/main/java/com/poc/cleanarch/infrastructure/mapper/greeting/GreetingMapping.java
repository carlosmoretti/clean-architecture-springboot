package com.poc.cleanarch.infrastructure.mapper.greeting;

import com.poc.cleanarch.infrastructure.data.model.GreetingModel;
import com.poc.cleanarch.infrastructure.mapper.Mapper;

import org.springframework.stereotype.Component;

import com.poc.cleanarch.core.greeting.Greeting;

@Component
public class GreetingMapping implements Mapper<Greeting, GreetingModel> {

	@Override
	public GreetingModel toDto(Greeting obj) {
		// TODO Auto-generated method stub
		return new GreetingModel(obj.getId(), obj.getTitle(), obj.getDate());
	}

	@Override
	public Greeting fromDto(GreetingModel obj) {
		// TODO Auto-generated method stub
		return new Greeting(obj.getId(), obj.getTitulo(), obj.getDate());
	}

}
