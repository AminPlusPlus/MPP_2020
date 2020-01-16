package w1_l3_4;

public class Condo extends Property {
	
	private int numFloors;

	public Condo(Address address, double rent,int numFloors) {
		super(address, rent);
		this.numFloors = numFloors;
	}

	@Override
	public double computeTotalRent() {
		return 400 * numFloors;
	}

	public int getNumFloors() {
		return numFloors;
	}

}
