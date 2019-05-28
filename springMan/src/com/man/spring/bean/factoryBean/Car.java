package com.man.spring.bean.factoryBean;

public class Car {

	private String company;
	private String brand;

	private int maxSpeed;
	private float price;
	
	public Car() {}
	
	public Car(String brand, float price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", brand=" + brand + ", maxSpeed="
				+ maxSpeed + ", price=" + price + "]";
	}
}
