package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		System.out.println("Enter the product name: ");
		p1.name = sc.next();
		System.out.println("Enter the price of product: ");
		p1.price = sc.nextDouble();
		System.out.println("Enter the quantity of product: ");
		p1.quantity = sc.nextInt();
		System.out.println("Product Data: " + p1.toString());
		System.out.println("Enter the quantity of products to be added in stock: ");
		p1.AddProducts(sc.nextInt());
		System.out.println("Updated Data: " + p1.toString());
		System.out.println("Enter the quantity of products to be removed from stock: ");
		p1.RemoveProducts(sc.nextInt());
		System.out.println("Updated Data: " + p1.toString());
		sc.close();
		
		System.out.println(p1.toString());
	}

}
