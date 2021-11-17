package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Building {

    private ArrayList<Sensor> sensorer = new ArrayList<Sensor>();
    private ArrayList<Aktuator> aktuatorer = new ArrayList<Aktuator>();

    private String navn;

    public Building(String navn){
        this.navn = navn;
    }

    public ArrayList<Sensor> getSensorer(){
        return sensorer;
    }

    public ArrayList<Aktuator> getAktuatorer(){
        return aktuatorer;
    }

    public void tilføjSensor(Sensor sensor){
        sensorer.add(sensor);
    }

    public void tilføjAktuator(Aktuator aktuator){
        aktuatorer.add(aktuator);
    }

    public void fjernSensor(Sensor sensor){
        sensorer.remove(sensor);
    }

    public void fjernAktuator(Aktuator aktuator){
        aktuatorer.remove(aktuator);
    }

    public void tilføjCo2Sensor(Sensor sensor, Building building){
        building.tilføjSensor(sensor);
    }

    public void tilføjTempSensor(Sensor sensor, Building building){
        building.tilføjSensor(sensor);
    }

    public void tilføjAktuator(Aktuator aktuator, Building building){
        building.tilføjAktuator(aktuator);
    }

    public void showSensorList(Building building){
        System.out.println(Arrays.toString(building.sensorer));
    }

    public void showAktuatorList(Building building){
        System.out.println(Arrays.toString(building.aktuatorer));
    }



}
