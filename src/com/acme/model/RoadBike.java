package com.acme.model;

public abstract class RoadBike extends AbstractBike{

    protected RoadBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    @Override
    public String getStyle() {
        return "Road Bike";
    }

}