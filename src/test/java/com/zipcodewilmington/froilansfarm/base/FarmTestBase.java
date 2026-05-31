package com.zipcodewilmington.froilansfarm.base;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Chicken;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crop.CropRow;

import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Farm;

import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

import org.junit.jupiter.api.BeforeEach;

public abstract class FarmTestBase {

    protected Farm farm;

    protected Froilan froilan;
    protected Froilanda froilanda;

    protected Tractor tractor;
    protected CropDuster cropDuster;

    protected Field field;

    protected CropRow cropRow1;
    protected CropRow cropRow2;
    protected CropRow cropRow3;

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

        cropRow1 = new CropRow<>();
        cropRow2 = new CropRow<>();
        cropRow3 = new CropRow<>();
        
        field.addRow(cropRow1);
        field.addRow(cropRow2);
        field.addRow(cropRow3);

        farm.setField(field);

        stable = new Stable();
        coop = new ChickenCoop();

        horse = new Horse();
        chicken = new Chicken(false);

        stable.add(horse);
        coop.add(chicken);
    }
}