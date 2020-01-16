package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum ;
	private List<OrderLine> orderLines = new ArrayList<>();
	
	public Order(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public void addOrderLine(int lineNum,double price,int quantity,LocalDate orderDate) {
		OrderLine newOrderLine = new OrderLine(lineNum,price,quantity, orderDate,this);
		orderLines.add(newOrderLine);
	}
	public int getOrderNum() {
		return orderNum;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	
	
}
