package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int q) {
		quantity += q;
	}
	
	public void RemoveProducts(int q) {
		quantity -= q;
	}
}
