package com.aurelien.Entity;

public class User 
{
	private int id;
	private int age;
	private int balance;
	private String firstname;
	private String lastname;
	private Car[] cars;
	
	public User(int id, int age, int balance, String firstname, String lastname)
{
		super();
		this.id = id;
		this.age = age;
		this.balance = balance;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public User() {}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public Car[] getCars() 
	{
		return cars;
	}
	public void setCars(Car[] cars) 
	{
		this.cars = cars;
	}
}
