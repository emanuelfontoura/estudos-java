package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {	
		Order order = new Order(01, 10.25, LocalDateTime.parse("2024-04-03T13:00"), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
