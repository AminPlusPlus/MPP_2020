package w1_l3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Building bld1 = new Building(12345);
		List<Apartment> apartmentsBld1 = new ArrayList<Apartment>();
		
		bld1.addApartment(Arrays.asList(
				new Apartment(1000,bld1),
				new Apartment(500,bld1),
				new Apartment(2000,bld1),
				new Apartment(3000,bld1)
		));
		
		System.out.println("Building 1 Profit :"+bld1.getProfitCost());

	}

}
