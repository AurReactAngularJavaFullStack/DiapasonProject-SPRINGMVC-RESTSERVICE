package com.aurelien.Entity;

public class Car
{
	private int id;
	private String brand;
	private String model;
	private int value;
	
	public Car(int id, String brand, String model, int value) 
	{
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
