package w1_l3_4;

public class Trailer extends Property {

	public Trailer(Address address, double rent) {
		super(address, rent);
	}

	@Override
	public double computeTotalRent() {
		return super.getRent();
	}

}
