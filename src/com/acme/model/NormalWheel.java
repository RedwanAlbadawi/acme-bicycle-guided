package com.acme.model;

public class NormalWheel extends AbstractWheel {
    public NormalWheel() {
        super(false);
    }

    @Override
    public int getSize() {
        return 25;
    }
}