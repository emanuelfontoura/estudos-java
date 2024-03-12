package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas? ");
		int n = sc.nextInt();
		sc.close();
		
		double[] alturas = new double[n];
		
		for(int c = 0; c < n; c++) {
			System.out.printf("Digite a altura da pessoa %d: ", c+1);
			System.out.println("");
			alturas[c] = sc.nextDouble();
		}
		
		double somaAlturas = 0;
		for(int c = 0; c < alturas.length; c++) {
			somaAlturas += alturas[c];
		}
		
		double mediaAlturas = somaAlturas / n;
		
		System.out.printf("A média de altura é %.2f", mediaAlturas);
	}

}
