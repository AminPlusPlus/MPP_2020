package w1_l3_4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { 
				new House(400, new Address("1000 N ","Fairfield", "IOWA", 52557), 400),
				new Condo(new Address("1000 N ","Fairfield", "IOWA", 52557), 300, 25), 
				new Trailer(new Address("1000 N ","Fairfield", "IOWA", 52557), 500) };
		
		double totalRent = Admin.computeTotalRent(objects);
		
		System.out.println(totalRent);
	}
}
