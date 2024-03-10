package application;

import java.util.Locale;
import java.util.Scanner;
import forms.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);;
		
		Scanner sc = new Scanner(System.in);
		double radius;
		
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		sc.close();
		
		System.out.println(String.format("PI Value: %f", Calculator.PI));
		System.out.println(String.format("Circumference: %.2f", Calculator.circumference(radius)));
		System.out.println(String.format("Area: %.2f", Calculator.area(radius)));
		System.out.println(String.format("Volume: %.2f", Calculator.volume(radius)));
	}

}
