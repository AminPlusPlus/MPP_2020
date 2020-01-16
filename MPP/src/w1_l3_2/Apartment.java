package w1_l3_2;

public class Apartment {

	private double rentCost;
	private Building building;
	
	
	
	Apartment(double rentCost, Building building) {
		this.rentCost = rentCost;
		this.building = building;
	}
	
	
	public double getRentCost() {
		return rentCost;
	}
	public Building getBuilding() {
		return building;
	}
	
	
}
