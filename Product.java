package com.imran.gradle;

public class Product {
	String name;
	String discription;
	String price;
	public Product(String name, String discription, String price) {
		super();
		this.name = name;
		this.discription = discription;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", discription=" + discription + ", price=" + price + "]";
	}
}
