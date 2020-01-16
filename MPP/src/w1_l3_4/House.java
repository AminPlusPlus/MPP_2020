package w1_l3_4;

public class House extends Property {
	private double lotSize;

	public House (double rent,Address address,double lotSize) {
		super(address, rent);
		this.lotSize = lotSize;
		
	} 
	
	@Override
	public double computeTotalRent() {
		return 0.1 * lotSize;
	}

	public double getLotSize() {
		return lotSize;
	}
}
