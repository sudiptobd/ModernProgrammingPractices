package lab3.prob3.composition;

public class Cylinder {
    private Circle baseCircle;
    private double height;

    public Cylinder(double radius, double height) {
        this.baseCircle = new Circle(radius);
        this.height = height;
    }

    public double computeVolume() {
        return baseCircle.computeArea() * height;
    }
}
