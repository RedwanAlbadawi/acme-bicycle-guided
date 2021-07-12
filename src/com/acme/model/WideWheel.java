package com.acme.model;

public class WideWheel extends AbstractWheel{
    public WideWheel() {
        super(true);
    }

    @Override
    public int getSize() {
        return 27;
    }
}