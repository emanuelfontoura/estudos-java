package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product name: ");
		String name = sc.next();
		System.out.println("Enter the price of product: ");
		double price = sc.nextDouble();
		
		Product p1 = new Product(name, price);
		
		System.out.println("Product Data: " + p1.toString());
		System.out.println("Enter the quantity of products to be added in stock: ");
		int AddProducts = sc.nextInt();
		p1.AddProducts(AddProducts);
		System.out.println("Updated Data: " + p1.toString());
		
		System.out.println("Enter the quantity of products to be removed from stock: ");
		int RemoveProducts = sc.nextInt();
		p1.RemoveProducts(RemoveProducts);
		System.out.println("Updated Data: " + p1.toString());
		sc.close();
		
		System.out.println(p1.toString());
	}

}
