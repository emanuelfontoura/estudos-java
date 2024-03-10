package application;

import java.util.Locale;
import java.util.Scanner;
import forms.Rectangle;;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter the rectangle width and height, respectively: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		sc.close();
		
		System.out.println(rec.toString());
	}

}
