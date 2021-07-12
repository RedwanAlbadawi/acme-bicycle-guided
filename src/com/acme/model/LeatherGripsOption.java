package com.acme.model;

public class LeatherGripsOption extends AbstractBikeOption {

    public LeatherGripsOption(BikeInterface bike) { super(bike); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 29.99f;
    }
}
