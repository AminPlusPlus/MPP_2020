package w1_l3_4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeTotalRent();
		}
		return totalRent;
	}
}
