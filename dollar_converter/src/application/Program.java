package application;

import java.util.Locale;
import java.util.Scanner;
import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double dollarPrice;
		double value;
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		value = sc.nextDouble();
		sc.close();
		System.out.printf("Amount to be paid in Reais (R$): %.2f", CurrencyConverter.converter(dollarPrice, value));
	}

}
