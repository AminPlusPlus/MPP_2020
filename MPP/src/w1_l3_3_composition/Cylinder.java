package w1_l3_3_composition;

public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder(double radius, double height) {
		this.height = height;
		this.circle = new Circle(radius);
	}

	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return (circle.getRadius() * circle.getRadius()) * height;
	}
	
	public double getRadius() {
		return circle.getRadius();
	}
}
