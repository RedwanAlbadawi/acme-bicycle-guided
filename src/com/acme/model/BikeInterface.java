package com.acme.model;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getPrice();
    int getStartNumber();
    String getModel();
    String getStyle();

    void paint(BikeColor color);
}