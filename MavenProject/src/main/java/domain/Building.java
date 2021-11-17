package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Building {

    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Aktuator> aktuators = new ArrayList<Aktuator>();

    private String name;

    public Building(String name){
        this.name = name;
    }

    public ArrayList<Sensor> getSensors(){
        return sensors;
    }

    public ArrayList<Aktuator> getAktuators(){
        return aktuators;
    }

    public void addSensorToList(Sensor sensor){
        sensor.add(sensor);
    }

    public void addAktuatorToList(Aktuator aktuator){
        aktuator.add(aktuator);
    }

    public void removeSensorFromList(Sensor sensor){
        sensor.add(sensor);
    }

    public void removeAktuatorFromList(Aktuator aktuator){
        aktuator.add(aktuator);
    }

    public void addCo2SensorToBuilding(Sensor sensor, Building building){
        building.addSensorToList(sensor);
    }

    public void addTempSensorToBuilding(Sensor sensor, Building building){
        building.addSensorToList(sensor);
    }

    public void addAkturatorToBuilding(Aktuator aktuator, Building building){
        building.addAktuatorToList(aktuator);
    }

    public void removeSensorFromBuilding(Sensor sensor, Building building){
        building.removeSensorFromList(sensor);
    }

    public void removeAktuatorFromBuilding(Aktuator aktuator, Building building){
        building.removeAktuatorFromList(aktuator);
    }

    public void showSensorList(Building building){
        building.getSensors();
    }

    public void showAktuatorList(Building building){
        System.out.println(Arrays.toString(building.aktuators));
    }



}
