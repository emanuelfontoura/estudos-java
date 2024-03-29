package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
		this.quantity = 10;
	}
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + ", Total: " + String.format("%.2f", TotalValueInStock());
	}
}
