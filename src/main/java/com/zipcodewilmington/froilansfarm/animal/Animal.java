package com.zipcodewilmington.froilansfarm.animal;

public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public void eat(Edible edible) {
        System.out.println("Animal is eating");
    }
}
