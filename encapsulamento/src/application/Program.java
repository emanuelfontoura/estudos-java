package application;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Product rice = new Product("Rice", 10.20);
		rice.setName("Bean");
		rice.setPrice(12.20);
		System.out.printf("Name: %s | Price: $ %.2f", rice.getName(), rice.getPrice());
	}

}
