
package com.acme.model;

public class DownhillBike extends MountainBike {
    public DownhillBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    public DownhillBike(WheelInterface wheel) {
        super(wheel, BikeColor.BLACK);
    }

    @Override
    public float getPrice() { return 699.99f; }

    @Override
    public String getModel() {return "DB505";}

    @Override
    public int getStartNumber() { return 852456; }

}