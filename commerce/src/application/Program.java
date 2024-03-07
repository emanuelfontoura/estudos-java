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
		System.out.printf("Name: %s, $ %.2f, %d units, Total: %.2f%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());
		System.out.println("Enter the quantity of products to be added in stock: ");
		p1.AddProducts(sc.nextInt());
		System.out.printf("Updated data - Name: %s, $ %.2f, %d units, Total: %.2f%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());
		System.out.println("Enter the quantity of products to be removed from stock: ");
		p1.RemoveProducts(sc.nextInt());
		System.out.printf("Updated data - Name: %s, $ %.2f, %d units, Total: %.2f%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());
		sc.close();
		
		System.out.println(p1);
	}

}
