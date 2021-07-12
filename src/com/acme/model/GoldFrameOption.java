package com.acme.model;

public class GoldFrameOption extends AbstractBikeOption{

    public GoldFrameOption(BikeInterface bike) {super(bike, BikeColor.GOLD); }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 149.99f;
    }
}
