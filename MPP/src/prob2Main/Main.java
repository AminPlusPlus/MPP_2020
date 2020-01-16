package prob2Main;

import java.util.List;

import prob2A.GradeReport;
import prob2A.Student;
import prob2B.Order;
import prob2B.OrderLine;

public class Main {
	
	public static void main (String [] args) {
		
		Student s1 = new Student("Adham");
		
		// GradeReport gr = new GradeReport(s1); 
		// compiler error above since constructor is not visible, only way to get GradeReport 
		//is through Student.
		
		GradeReport gr = s1.getReport();
		
		Order order = new Order(1);
		
		// OrderLine ol = new OrderLine(order);
		// compiler error above since constructor is not visible, only way to get OrderLine 
		//is through Order.
		List<OrderLine> ol = order.getOrderLines();
		
	}

}
