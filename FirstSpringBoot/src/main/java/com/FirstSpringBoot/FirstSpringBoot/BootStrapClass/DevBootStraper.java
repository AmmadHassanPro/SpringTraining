package com.FirstSpringBoot.FirstSpringBoot.BootStrapClass;

import org.springframework.context.ApplicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.FirstSpringBoot.FirstSpringBoot.Model.Author;
import com.FirstSpringBoot.FirstSpringBoot.Model.Book;
import com.FirstSpringBoot.FirstSpringBoot.Model.Publisher;
import com.FirstSpringBoot.FirstSpringBoot.Repo.AuthorRepo;
import com.FirstSpringBoot.FirstSpringBoot.Repo.BookRepo;
import com.FirstSpringBoot.FirstSpringBoot.Repo.PublisherRepo;

@Component
public class DevBootStraper implements ApplicationListener<ContextRefreshedEvent> {
public AuthorRepo author_repo;
public BookRepo book_repo;
public PublisherRepo pub_repo;

DevBootStraper(AuthorRepo a,BookRepo b, PublisherRepo p ){
	this.author_repo = a;
	this.book_repo = b;
	this.pub_repo = p;
	
}
	
	
public void init() 
{
	
Publisher p1 = new Publisher();	
p1.setName("Oriely");
p1.setCity("Addison");
p1.setState("Il");
p1.setZip("60101");
p1.setAddress("415 E Cherry");

Author a = new Author("Eric" , "Evans");
Book b = new Book("Learn Java", "123" , p1);


p1.setBook(b);

a.getBooks().add(b);

b.getAuthors().add(a);


Publisher p2 = new Publisher();
p2.setName("Wrox");
p2.setCity("Bangore");
p2.setState("Main");
p2.setZip("60362");
p2.setAddress("500 E Wrox");
	
Author c = new Author("Robert" , "lafore");
Book d = new Book("Object Oriented Programming in C", "123" , p2);

p2.setBook(d);
a.getBooks().add(d);

b.getAuthors().add(c);






author_repo.save(a);
a.setFirstName("AMMAD");
author_repo.save(a);
author_repo.save(c);
book_repo.save(b);
book_repo.save(d);
pub_repo.save(p1);
pub_repo.save(p2);

}




@Override
public void onApplicationEvent(ContextRefreshedEvent arg0) {
	// TODO Auto-generated method stub
	init();
}	
	
}
