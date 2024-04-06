package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {	
		Order order = new Order(01, 10.25, LocalDateTime.parse("2024-04-03T13:00"), OrderStatus.PENDING_PAYMENT);
		Order order2 = new Order(02, 11.25, LocalDateTime.parse("2024-04-04T14:00"), OrderStatus.SHIPPED);
		
		System.out.println(order);
		System.out.println(order2);
		
		LocalDateTime inicio = LocalDateTime.parse("2024-04-04T11:20:00");
		System.out.println(inicio.plusHours(1).plusMinutes(45));
	}

}
