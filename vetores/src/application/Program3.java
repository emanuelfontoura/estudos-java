package application;

import java.util.Scanner;
import java.util.Locale;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você irá digitar: ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(int c = 0; c < numeros.length; c++) {
			System.out.printf("Número %d: ", c + 1);
			numeros[c] = sc.nextDouble();
		}
		
		System.out.println("Números negativos digitados: ");
		for(int c = 0; c < numeros.length; c++) {
			if(numeros[c] < 0) {
				System.out.println(numeros[c]);
			}
		}
		
		sc.close();
	}

}
