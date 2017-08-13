package com.FirstSpringBoot.FirstSpringBoot.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class Publisher {


public Publisher() {
	
	
	
	
}	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long id;

@OneToOne
@JoinTable(name="PublisherAndBooks", joinColumns=@JoinColumn(name="book_id"),inverseJoinColumns=@JoinColumn(name="publisher_id"))
public Book book;

public void setBook(Book c) {
	this.book = c;
	
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getZip() {
	return Zip;
}
public void setZip(String zip) {
	Zip = zip;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String Address;
public String City;
public String State;
public String Zip;
public String Name;

}
