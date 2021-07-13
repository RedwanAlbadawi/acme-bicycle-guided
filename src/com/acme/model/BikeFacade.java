package com.acme.model;

public class BikeFacade {
    //TODO Look into using this simulation user sale
    public void prepareForSale(BikeInterface bike) {
        Registration reg = new Registration(bike);
        reg.allocatingBikeSerialNumber();
        Documentaion.printBrochure();
        bike.airTires();
        bike.washFrame();
        bike.testRide();
    }
}
