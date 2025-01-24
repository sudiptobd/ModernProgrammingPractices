package lab7.prob2;

public class Ellipse implements ClosedCurve {
  private double axis;
  private double eccentricity;

    @Override
    public double computePerimeter() {
        return 4 * axis * eccentricity;
    }
    public Ellipse(double axis, double eccentricity) {
        this.axis = axis;
        this.eccentricity = eccentricity;
    }
}
