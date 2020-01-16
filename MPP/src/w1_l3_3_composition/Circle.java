package w1_l3_3_composition;

public class Circle  {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double computerArea() {
		return (radius * radius) * 3.14;
	}
}
