package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Room[] rooms = new Room[9];
		
		System.out.print("How many rooms will be rented [max 10]: ");
		int n = sc.nextInt();
		
		String name;
		String email;
		int room;
		for(int c = 0; c < n; c++) {
			System.out.printf("Rent #%d%n", c + 1);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Room [among 1 and 10]: ");
			room = sc.nextInt();
			rooms[room - 1] = new Room(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int c = 0; c < rooms.length; c++) {
			if(rooms[c] != null) {
				System.out.printf("%d: %s, %s %n", c + 1, rooms[c].getName(), rooms[c].getEmail());
			}
		}
	}

}
