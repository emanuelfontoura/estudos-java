package application;

public class Program {

	public static void main(String[] args) {
		
		// DUAS FORMAS DE DECLARAR UMA ARRAY COM VALORES JÁ DEFINIDOS
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nomes = new String[] {"José", "Maria", "João"};
		
		// LAÇO FOR EACH
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
