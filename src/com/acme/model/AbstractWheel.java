package com.acme.model;

public abstract class AbstractWheel implements WheelInterface {
    private boolean wheelThickness;

    public AbstractWheel(boolean thickness) {
        wheelThickness = thickness;
    }

    @Override
    public boolean isWide() {
        return wheelThickness;
    }

    public abstract int getSize();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + getSize() + " inches";
    }
}