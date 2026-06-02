package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce<T extends Edible> {
    T yield();

    boolean isFertilized();

    void setFertilized(boolean fertilized);
}
