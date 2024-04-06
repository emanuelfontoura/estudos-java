package entities;

import java.time.LocalDateTime;

import entities.enums.OrderStatus;

public class Order {
	private int id;
	private double price;
	private LocalDateTime date;
	private OrderStatus status;
	
	public Order(int id, double price, LocalDateTime date, OrderStatus status) {
		super();
		this.id = id;
		this.price = price;
		this.date = date;
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Id: " + id + " | Preço: " + price + " | Data: " + date + " | Status: " + status;
	}
}
