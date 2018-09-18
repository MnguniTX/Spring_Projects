package com.digital.academy.FirstSpringApplication.entity;






public class Person {
	private int id;
	private String name;
	private String surname;
	private String gender;
	
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int id, String name, String surname, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
