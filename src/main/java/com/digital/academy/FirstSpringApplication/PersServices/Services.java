package com.digital.academy.FirstSpringApplication.PersServices;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.digital.academy.FirstSpringApplication.dao.Service;
import com.digital.academy.FirstSpringApplication.entity.Person;


@Component
public class Services implements Service {
	
	ArrayList<Person> arrList = new ArrayList<>();
	
	public String addUser(Person pers)
	{
		arrList.add(pers);
		
		return "User Successfully Added";
	}
	
	
	public String listUsers()
	{
		String list = "";
		for(Person pers : arrList)
		{
			list += pers.toString() + "\n";
		}
		
		return list;
	}
	
	
	public String search(String name)
	{
		
		String det = "";
		for(Person pers : arrList)
		{
			if(pers.getName().equalsIgnoreCase(name))
			{
				det = pers.toString();
				break;
			}
		}
		return det;
	}

}
