package com.jahnvi.properties.interfaces;

public interface Engine {

    static final int PRICE = 79000;
    // there is no need to write static and final keywords in front of PRICE , because,we already know that , variables in java are static and finalised , hence cannot be changed.

    void start();
    void stop();
    void accelerate();

}
