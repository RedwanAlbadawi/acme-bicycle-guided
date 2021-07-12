package com.acme.model;

public class WhiteTireOption extends AbstractBikeOption{

    public WhiteTireOption(BikeInterface bike) {super(bike); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 19.99f;
    }



}
