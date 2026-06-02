package com.zipcodewilmington.froilansfarm.crop;

public class CornStalk extends Crop<EarCorn> {

    public CornStalk() {
        super(false, false);
    }

    public CornStalk(boolean fertilized, boolean harvested) {
        super(fertilized, harvested);
    }

    @Override
    public EarCorn yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new EarCorn();
        }

        return null;
    }
}