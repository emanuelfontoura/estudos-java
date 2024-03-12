package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		
		System.out.println("Enter the product name: ");
		name = sc.next();
		System.out.println("Enter the price of product: ");
		price = sc.nextDouble();
		System.out.println("Enter the quantity of product: ");
		quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		System.out.println("Product Data: " + product.toString());
		System.out.println("Enter the quantity of products to be added in stock: ");
		product.AddProducts(sc.nextInt());
		System.out.println("Updated Data: " + product.toString());
		System.out.println("Enter the quantity of products to be removed from stock: ");
		product.RemoveProducts(sc.nextInt());
		System.out.println("Updated Data: " + product.toString());
		sc.close();
		
		System.out.println(product.toString());
	}

}
