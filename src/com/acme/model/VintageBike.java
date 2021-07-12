package com.acme.model;

public class VintageBike extends RoadBike{
    public VintageBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    public VintageBike(WheelInterface wheel) {
        super(wheel, BikeColor.RED);
    }

    @Override
    public float getPrice() { return 299.99f; }

    @Override
    public String getModel() { return "VB801"; }

    @Override
    public int getStartNumber() { return 753159; }

}