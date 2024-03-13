package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão registradas: ");
		int n = sc.nextInt();
		
		Pessoas[] pessoas = new Pessoas[n];
		
		String nome;
		int idade;
		double altura;
		for(int c = 0; c < pessoas.length; c++) {
			System.out.printf("Nome da pessoa %d: ", c + 1);
			nome = sc.next();
			System.out.printf("Idade da pessoa %d: ", c + 1);
			idade = sc.nextInt();
			System.out.printf("Altura da pessoa %d: ", c + 1);
			altura = sc.nextDouble();
			pessoas[c] = new Pessoas(nome, idade, altura);
		}
		
		double somaAlturas = 0;
		for(int c = 0; c < pessoas.length; c++) {
			somaAlturas += pessoas[c].getAltura();		
		}
		
		double mediaAlturas = somaAlturas / pessoas.length;
		
		System.out.printf("A média das alturas é: %.2f", mediaAlturas);
		
		sc.close();
	}

}
