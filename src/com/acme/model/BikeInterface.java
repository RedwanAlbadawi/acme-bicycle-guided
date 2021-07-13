package com.acme.model;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getPrice();
    int getStartNumber();
    String getModel();
    String getStyle();
    String getSerialNumber();
    void setSerialNumber(String serial);

    void paint(BikeColor color);

    void washFrame();
    void airTires();
    void testRide();
}