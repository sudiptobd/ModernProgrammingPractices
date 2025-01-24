package lab7.prob2;

public class EquilateralTriangle implements Polygon {
    final private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double[] getSides() {
        return new double[]{sideLength, sideLength, sideLength};
    }
}
