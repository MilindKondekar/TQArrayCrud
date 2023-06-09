package com.mobile;

public class MobileStore 
{

	private int id;
	private String name;
	private String brand;
	private float price;
	
	
	MobileStore()
	{
		
	}


	public MobileStore(int id, String name, String brand, float price) 
	{
		
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getId() 
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getBrand()
	{
		return brand;
	}


	public void setBrand(String brand) 
	{
		this.brand = brand;
	}


	public float getPrice() 
	{
		return price;
	}


	public void setPrice(float price)
	{
		this.price = price;
	}


	
	public String toString() 
	{
		return "MobileStore id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price ;
	}
	
	
	
	
	
}
