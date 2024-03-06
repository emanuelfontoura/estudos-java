package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		System.out.println("Qual o nome do produto?");
		p1.name = sc.next();
		System.out.println("Qual o preço do produto?");
		p1.price = sc.nextDouble();
		System.out.println("Qual a quantidade do produto?");
		p1.quantity = sc.nextInt();
		System.out.println("Quer adicionar qual quantia ao estoque?");
		p1.AddProducts(sc.nextInt());
		System.out.println("Quer remover qual quantia do estoque?");
		p1.RemoveProducts(sc.nextInt());
		System.out.printf("Produto: %s%n Preço: %.1f%n Quantidade: %d%n Valor total em estoque: %.2f%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());
	}

}
