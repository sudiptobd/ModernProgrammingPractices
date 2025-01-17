package lab3.prob4;

public class Condo extends Property {
    private int numFloors;

    public Condo(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numFloors;
    }
}
