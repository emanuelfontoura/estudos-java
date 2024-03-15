package application;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// BOXING
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// UNBOXING
		int y = (int) obj;
		
		System.out.println(y);
		
		// ENTIDADE USANDO WRAPPER CLASS
		Product p = new Product("Rice", 11.25, null);
		
		System.out.println(p.getQuantity());
	}

}
