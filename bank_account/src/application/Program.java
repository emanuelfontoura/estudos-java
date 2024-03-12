package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account account;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		System.out.print("Is there a initial deposit (y/n)?  ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		double accDepositValue = sc.nextDouble();
		account.deposit(accDepositValue);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		double accWithdrawValue = sc.nextDouble();
		account.withdraw(accWithdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		sc.close();
	}

}
