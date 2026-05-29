package com.zipcodewilmington.froilansfarm.animal;

public class Horse extends Animal implements Rideable {

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void ride() {
        System.out.println("Riding the horse");
    }
}
