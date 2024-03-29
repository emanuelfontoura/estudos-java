package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rows and colums (NxN): ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Row %d, Column %d: ", i + 1, j + 1);
				mat[i][j] = sc.nextInt();
				System.out.println("");
			}
		}
		
		System.out.println("Matriz: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Main Diagonal: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					System.out.printf("%d ", mat[i][j]);
				}
			}
			System.out.println("");
		}
		
		System.out.println("Negative Numbers: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					System.out.printf("%d ", mat[i][j]);
				}
			}
			System.out.println("");
		}
	}

}
