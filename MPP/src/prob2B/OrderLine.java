package prob2B;

import java.time.LocalDate;

public class OrderLine {
	
	private int lineNum;
	private double price;
	private int quantity;
	private LocalDate orderDate;
	
	private Order order;
	
	OrderLine(int lineNum,double price, int quantity, LocalDate date,Order order) {
		this.lineNum = lineNum;
		this.price = price;
		this.quantity = quantity;
		this.orderDate = date;
		this.order = order;
	}

	public int getLineNum() {
		return lineNum;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getPrice() {
		return price;
	}

	public Order getOrder() {
		return order;
	}
	
	
}
