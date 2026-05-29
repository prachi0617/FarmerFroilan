package com.zipcodewilmington.froilansfarm.animal;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck";
    }

    @Override
    public Edible yield() {
        if (!hasBeenFertilized) {
            return new EdibleEgg();
        }

        return null;
    }
}