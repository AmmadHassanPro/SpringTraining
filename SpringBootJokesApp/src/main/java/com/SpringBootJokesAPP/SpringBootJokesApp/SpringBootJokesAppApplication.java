package com.SpringBootJokesAPP.SpringBootJokesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJokesAppApplication.class, args);
		
		
		guru.springframework.norris.chuck.ChuckNorrisQuotes quote = new guru.springframework.norris.chuck.ChuckNorrisQuotes(); 
		
		String Quotes =  quote.getRandomQuote();
		System.out.println("\n\n---------------------------");
		System.out.println(Quotes);
		
		System.out.println("\n\n---------------------------");
	}
}
