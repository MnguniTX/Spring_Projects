package com.digital.academy.FirstSpringApplication.dao;





import com.digital.academy.FirstSpringApplication.entity.Person;



public interface Service {
	
	
	public String addUser(Person pers);
	public String listUsers();
	public String search(String name);

}
