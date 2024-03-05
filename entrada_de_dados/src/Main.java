import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		String nome, s1, s2, s3, clearBuffer;
		int idade;
		double altura, raizQuadrada;
		char sexo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = sc.next();
		System.out.printf("Seu nome é %s%n", nome);
		
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		System.out.printf("Sua idade é de %d%n", idade);
		
		System.out.println("Qual a sua altura?");
		altura = sc.nextDouble();
		System.out.printf("Sua altura é de %.2f%n", altura);
		
		System.out.println("Qual o seu sexo? [ M / F ]");
		sexo = sc.next().charAt(0);
		System.out.printf("Seu sexo é %c%n", sexo);
		
		clearBuffer = sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		sc.close();
		System.out.printf("Você digitou: %s, %s e %s", s1, s2, s3);
		
		raizQuadrada = Math.sqrt(2);
		System.out.printf("Raiz quadrada de 2: %f", raizQuadrada);
		
	}
}