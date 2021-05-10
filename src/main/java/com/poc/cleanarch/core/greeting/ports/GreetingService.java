package com.poc.cleanarch.core.greeting.ports;
import com.poc.cleanarch.infrastructure.shared.service.SharedService;
import com.poc.cleanarch.core.greeting.Greeting;

public interface GreetingService extends SharedService<Greeting, Long> {
}
