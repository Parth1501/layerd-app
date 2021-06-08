package com.rakuten.training.domain;

public class Product {
	
	int id;
	String name;
	double price;
	int qoh;
	public Product() {
		super();
	}
	public Product(String name, double price, int qoh) {
		super();
		this.name = name;
		this.price = price;
		this.qoh = qoh;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	
	@Override
	public String toString() {
		return "Product id: "+id+"\nProduct Name: "+name+"\nProduct quantity: "+qoh;
	}
	
	
	
	
}
