package lab3.prob3.inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double computeVolume() {
        return computeArea() * height;
    }
}
