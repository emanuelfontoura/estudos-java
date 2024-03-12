package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos? ");
		int n = sc.nextInt();
		
		Product[] product = new Product[n];

		String name;
		double price;
		for(int c = 0; c < product.length; c++) {
			System.out.printf("Name Product %d: ", c+1);
			name = sc.next();
			System.out.printf("Price Product %d: ", c+1);
			price = sc.nextDouble();
			product[c] = new Product(name, price);
		}
		
		double sumPrice = 0;
		for(int c = 0; c < product.length; c++) {
			sumPrice += product[c].getPrice();
		}
		
		System.out.printf("A soma dos preços dos produtos é: %.2f", sumPrice);
		
		sc.close();
	}

}
