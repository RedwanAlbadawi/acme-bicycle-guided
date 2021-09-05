package com.acme.sample;

import com.acme.model.*;
import java.util.ArrayList;

/*
* Creating a smaple inventory for each of the
* Bicycles. This includes the serial number
* */
public class SampleInventory {
    private final ArrayList<TouringBike> touringList;
    private final ArrayList<VintageBike> vintageList;
    private final ArrayList<CrossCountryBike> crossCountryList;
    private final ArrayList<DownhillBike> downHillList;
    private final SerialNumberGenerator generator;

    public SampleInventory() {
        // Will use constructor to build the inventory.
        generator = SerialNumberGenerator.getInstance();
        touringList = buildTouringInventory(new ArrayList<>());
        vintageList = buildVintageInventory(new ArrayList<>());;
        crossCountryList = buildCrossCountryInventory(new ArrayList<>());
        downHillList = buildDownhillInventory(new ArrayList<>());

    }

    public ArrayList<TouringBike> getTouringList(){
        return touringList;
    }

    public ArrayList<VintageBike> getVintageList(){
        return vintageList;
    }

    public ArrayList<DownhillBike> getDownHillList(){
        return downHillList;
    }

    public ArrayList<TouringBike> buildTouringInventory(ArrayList<TouringBike> bikeList) {
        TouringBike bike = new TouringBike(new NormalWheel());
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        for (int i = 0; i <= 10; i++) {
            bike =new TouringBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i,bike);
        }
        return bikeList;
    }

    public ArrayList<VintageBike> buildVintageInventory(ArrayList<VintageBike> bikeList) {
        VintageBike bike = new VintageBike((new NormalWheel()));
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        for (int i = 0; i <= 10; i++) {
            bike = new VintageBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }

    public ArrayList<CrossCountryBike> buildCrossCountryInventory(ArrayList<CrossCountryBike> bikeList){
        CrossCountryBike bike = new CrossCountryBike((new NormalWheel()));
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        for (int i = 0; i <= 10; i++) {
            bike = new CrossCountryBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }
    public ArrayList<DownhillBike> buildDownhillInventory(ArrayList<DownhillBike> bikeList) {
        DownhillBike bike = new DownhillBike(new NormalWheel());
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        for (int i = 0; i <= 10; i++) {
            bike = new DownhillBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }
}
