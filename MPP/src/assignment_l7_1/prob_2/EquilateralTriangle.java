package assignment_l7_1.prob_2;

public class EquilateralTriangle implements Polygon {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double[] getLengths() {
        return new double[] {side,side,side};
    }
}
