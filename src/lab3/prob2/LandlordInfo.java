package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double calcProfits() {
        return buildings.stream().mapToDouble(Building::calculateProfit).sum();
    }
}
