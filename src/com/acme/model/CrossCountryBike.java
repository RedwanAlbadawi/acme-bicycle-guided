package com.acme.model;

public class CrossCountryBike extends MountainBike{
    public CrossCountryBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    public CrossCountryBike(WheelInterface wheel) {
        super(wheel, BikeColor.GREEN);
    }

    @Override
    public float getPrice() { return 599.99f; }

    @Override
    public String getModel() { return "CB505"; }

    @Override
    public int getStartNumber() { return 258654;}

}