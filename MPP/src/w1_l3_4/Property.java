package w1_l3_4;

public abstract class Property {
	
	private Address adress;
	private double rent;
	
	
	public Property(Address address, double rent) {
		this.adress = address;
		this.rent = rent;
	}
	
	public abstract double computeTotalRent();

	public Address getAdress() {
		return adress;
	}

	public double getRent() {
		return rent;
	}
}
