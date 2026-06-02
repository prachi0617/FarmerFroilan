package com.zipcodewilmington.froilansfarm.interfaces;

public interface Eater<T extends Edible> {
    void eat(T edible);
}
