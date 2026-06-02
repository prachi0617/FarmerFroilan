package com.zipcodewilmington.froilansfarm.interfaces;

public interface Person<T extends Edible> extends NoiseMaker, Eater<T> {
    String getName();
}
