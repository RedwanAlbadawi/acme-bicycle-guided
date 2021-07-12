package com.acme.model;

public class LeatherSeatOption extends AbstractBikeOption{

    public LeatherSeatOption(BikeInterface bike) {super(bike); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 89.99f;
    }
}
