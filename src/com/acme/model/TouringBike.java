package com.acme.model;

public class TouringBike extends RoadBike {
    public TouringBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    public TouringBike(WheelInterface wheel) {
        super(wheel, BikeColor.BLUE);
    }

    @Override
    public float getPrice() { return 499.99f;  }

    @Override
    public String getModel() { return "TB901"; }

    @Override
    public int getStartNumber() { return 951357; }

}