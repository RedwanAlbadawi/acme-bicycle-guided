package com.acme.model;

public abstract class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;

    public AbstractBikeOption (BikeInterface bike) {
        super(bike.getWheel(), bike.getColor());
        decoratedBike = bike;
    }

    public AbstractBikeOption(BikeInterface bike,BikeColor color) {
        super(bike.getWheel(), color);
        decoratedBike = bike;
    }

    public final String getSerialNumber() {return decoratedBike.getSerialNumber(); }

    //TODO The contents of this method may need to be removed.
    // Not implemented during object creation
    public final void setSerialNumber(String serial) { serialNumber = serial; }

    public final int getStartNumber() {return decoratedBike.getStartNumber(); }

    public  String getModel() {return decoratedBike.getModel(); }

    public final String getStyle() {return decoratedBike.getStyle(); }
}
