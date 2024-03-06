import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		sc.close();
		
		int mask = 0b100000;
		
		if((n & mask) != 0) {
			System.out.println("O sexto bit é 1");
		}else {
			System.out.println("O sexto bit é 0");
		}
		
	}
}
