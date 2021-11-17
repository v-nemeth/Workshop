package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildingAdministrationSystem {

    private ArrayList<Building> buildings = new ArrayList<Building>();

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building){
        buildings.remove(building);
    }

}
