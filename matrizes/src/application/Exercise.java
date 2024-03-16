package application;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = sc.nextInt();
		
		int[][] numeros = new int[rows][columns];
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.printf("Row[%d], Column[%d]:  ", i + 1, j + 1);
				numeros[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.printf("%d ", numeros[i][j]);
			}
			System.out.printf("Tamanho coluna: %d%n", numeros[i].length);
		}
		
		System.out.print("Which element do you want to search: ");
		int element = sc.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				if(numeros[i][j] == element) {
					System.out.printf("Position [%d][%d]:%n", i + 1, j+ 1);
					if((j - 1) >= 0 && (j - 1) < numeros[i].length) {
						System.out.printf("Left: %d%n", numeros[i][j - 1]);
					}
					
					if((j + 1) >= 0 && (j + 1) < numeros[i].length) {
						System.out.printf("Right: %d%n", numeros[i][j + 1]);
					}
					
					if((i - 1) >= 0) {
						System.out.printf("Up: %d%n", numeros[i - 1][j]);
					}
					
					if((i + 1) > 0 && (i + 1) < numeros.length) {
						System.out.printf("Down: %d%n", numeros[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
