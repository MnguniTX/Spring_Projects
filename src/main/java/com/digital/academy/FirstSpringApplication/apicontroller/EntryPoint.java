package com.digital.academy.FirstSpringApplication.apicontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digital.academy.FirstSpringApplication.PersServices.Services;

import com.digital.academy.FirstSpringApplication.entity.Person;

@RestController
@RequestMapping("/thabo")
public class EntryPoint {
	
	@Autowired
	Services ser;
	
//	@GetMapping("/sto")
//	public String message(@RequestParam String name)
//	{
//		return "Thabo The Programmer " + name;
//	}
	
	@PutMapping("/add")
	public String addUser(@RequestParam int id, @RequestParam String name, @RequestParam String surname, @RequestParam String gender)
	{
		return ser.addUser(new Person(id,name,surname,gender));
	}
	
	@GetMapping("/list")
	public String listUsers()
	{
		return ser.listUsers();
	}
	
	@GetMapping("/search")
	public String Search(@RequestParam String name)
	{
		return ser.search(name);
	}
	

}
