package com.zipcodewilmington.froilansfarm.base;

import com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.crops;
import com.zipcodewilmington.froilansfarm.farmmembers;
import com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.vehicles;

import org.junit.jupiter.api.BeforeEach;

public abstract class FarmTestBase {

    protected Farm farm;

    protected Froilan froilan;
    protected Froilanda froilanda;

    protected Tractor tractor;
    protected CropDuster cropDuster;

    protected Field field;

    protected CropRow<CornStalk> cornRow;
    protected CropRow<TomatoPlant> tomatoRow;

    protected Stable stable;
    protected ChickenCoop coop;

    protected Horse horse;
    protected Chicken chicken;

    @BeforeEach
    public void setup() {

        farm = new Farm();

        froilan = new Froilan();
        froilanda = new Froilanda();

        tractor = new Tractor();
        cropDuster = new CropDuster();

        farm.addVehicle(tractor);
        farm.addAircraft(cropDuster);

        field = new Field();

        cornRow = new CropRow<>();
        tomatoRow = new CropRow<>();

        cornRow.add(new CornStalk(false, false));
        tomatoRow.add(new TomatoPlant(false, false));
        
        field.addRow(cornRow);
        field.addRow(tomatoRow);

        farm.setField(field);

        stable = new Stable();
        coop = new ChickenCoop();

        horse = new Horse();
        chicken = new Chicken(false);

        stable.add(horse);
        coop.add(chicken);
    }
}