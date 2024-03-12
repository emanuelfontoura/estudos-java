package entities;

public class Product {
	private String name;
	private double price;
	
	// CONSTRUCTOR
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// GETTERS
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
