package w1_l3_3;

public class Circle extends Cylinder {
	private double radius;
	
	public Circle(double radius) {
		super(radius,0);
		this.radius = radius;
	}

	public double getRadius(double radius) {
		return radius;
	}
	
	public double computerArea() {
		return (radius * radius) * 3.14;
	}
}
