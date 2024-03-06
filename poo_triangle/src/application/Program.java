package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Digite a medida dos lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite a medida dos lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		System.out.printf("Área do triângulo X: %.1f%n", x.area());
		System.out.printf("Área do triângulo Y: %.1f%n", y.area());
		System.out.printf("Maior área: %s", ((x.area() > y.area()) ? "X" : "Y"));
	}

}
