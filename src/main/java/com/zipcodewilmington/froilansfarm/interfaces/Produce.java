package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce {
    Edible yield();
    boolean isFertilized();
    void setFertilized(boolean fertilized);
}
