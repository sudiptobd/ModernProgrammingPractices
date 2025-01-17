package lab3.prob4;

public class Driver {

    public static void main(String[] args) {
        Property[] properties = {
                new House(10000),
                new Condo(3),
                new Trailer()
        };

        double totalRent = Admin.computeTotalRent(properties);
        System.out.println("Total Rent: $" + totalRent);
    }
}
