package application;
import entities.Aluno;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite seu nome: %n");
		String nome = sc.next();
		System.out.printf("Digite sua idade: %n");
		int idade = sc.nextInt();
		
		Aluno code01 = new Aluno(nome, idade);
		if(!code01.isNomeValido()) {
			System.out.println(code01.getMensagemErroNome());
		}else {
			System.out.println("Nome correto!");
		}
		
		sc.close();
	}

}
