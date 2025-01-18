package lab3.prob4;

public class Admin {
    public  int hello;
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property property : properties) {
            totalRent += property.computeRent();
        }
        return totalRent;
    }
}
