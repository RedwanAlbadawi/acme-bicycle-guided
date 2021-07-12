package com.acme.model;

public abstract class AbstractBike implements BikeInterface {

    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel, BikeColor color) {
        this.wheel = wheel;
        this.color = color;
    }

    public WheelInterface getWheel() { return wheel; }

    public BikeColor getColor() { return color; }

    public abstract float getPrice();
    public abstract int getStartNumber();
    public abstract String getModel();
    public abstract String getStyle();

    public void paint(BikeColor color) {
        this.color = color;
    }

    // Used for testing the objects during creation
    @Override
    public String toString() {
        return getClass().getSimpleName() + " with " + wheel + ", "+
                color + " color frame at $" + getPrice();
    } // VintageBike with NormalWheel at 25 inches, RED color frame at $299.99
}