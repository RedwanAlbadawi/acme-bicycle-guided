package com.acme.model;

public class Registration {
    private BikeInterface regBike;

    Registration(BikeInterface bike) {
        regBike = bike;
    }
    public void allocatingBikeSerialNumber() {
        //TODO Get serial number from regBike
        System.out.println("Allocating Bike Serial Number for Registration");
    }
}
