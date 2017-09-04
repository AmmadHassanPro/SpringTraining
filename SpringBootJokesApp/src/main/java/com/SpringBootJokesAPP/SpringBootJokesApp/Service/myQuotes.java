package com.SpringBootJokesAPP.SpringBootJokesApp.Service;

import org.springframework.stereotype.Component;

@Component
public class myQuotes {
	
public guru.springframework.norris.chuck.ChuckNorrisQuotes quotes = new guru.springframework.norris.chuck.ChuckNorrisQuotes();

public String getQuote() {

	
	return quotes.getRandomQuote();
	
	

	
	
}

}


