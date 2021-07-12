package com.acme.model;

public abstract class MountainBike extends AbstractBike {

    protected MountainBike(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }

    @Override
    public String getStyle() {
        return "Mountain Bike";
    }

}