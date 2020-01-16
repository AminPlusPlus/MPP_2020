package w1_l3_2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double totalCost;
	List<Apartment> apartments = new ArrayList<Apartment>();
	
	public Building(double totalCost){
		this.totalCost = totalCost;
		
	}
	
	public void addApartment(Apartment apt) {
		apartments.add(apt);
	}
	
	public void addApartment(List<Apartment> apts) {
		apartments.addAll(apts);
	}
	
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public double getProfitCost () {
		
		double total = 0.0;
		for(Apartment apt : apartments) 
			total+=apt.getRentCost();
		
		return (apartments.isEmpty()) ? 0.0 : totalCost-total;
	}

}
