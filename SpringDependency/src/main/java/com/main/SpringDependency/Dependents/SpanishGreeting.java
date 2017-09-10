package com.main.SpringDependency.Dependents;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("spanish")
public class SpanishGreeting implements Greetings {
@Override
public String Greet() {
	
	
	return "Hola‎";
}
}
