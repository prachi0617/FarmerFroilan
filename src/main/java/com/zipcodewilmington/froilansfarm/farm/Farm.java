package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilan;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilanda;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;

public class Farm {

    private FarmHouse farmHouse;
    private Field field;
    private final List<Stable> stables = new ArrayList<>();
    private final List<FarmVehicle> vehicles = new ArrayList<>();
    private final List<CropDuster> aircraft = new ArrayList<>();
    private final List<ChickenCoop> chickenCoops = new ArrayList<>();

    public Farm() {
        FarmHouse house = new FarmHouse();
        Froilan froilan = new Froilan();
        Froilanda froilanda = new Froilanda();
        house.addFarmer(froilan);
        house.addPilot(froilanda);
        this.farmHouse = house;

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        for (int i = 0; i < 4; i++) {
            stable1.add(new Horse());
        }
        for (int i = 0; i < 3; i++) {
            stable2.add(new Horse());
        }
        for (int i = 0; i < 3; i++) {
            stable3.add(new Horse());
        }

        addStable(stable1);
        addStable(stable2);
        addStable(stable3);

        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();

        for (int i = 0; i < 4; i++) {
            coop1.add(new com.zipcodewilmington.froilansfarm.animal.Chicken(false));
        }
        for (int i = 0; i < 4; i++) {
            coop2.add(new com.zipcodewilmington.froilansfarm.animal.Chicken(false));
        }
        for (int i = 0; i < 4; i++) {
            coop3.add(new com.zipcodewilmington.froilansfarm.animal.Chicken(false));
        }
        for (int i = 0; i < 3; i++) {
            coop4.add(new com.zipcodewilmington.froilansfarm.animal.Chicken(false));
        }

        addChickenCoop(coop1);
        addChickenCoop(coop2);
        addChickenCoop(coop3);
        addChickenCoop(coop4);

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        addVehicle(tractor);
        addVehicle(cropDuster);
        addAircraft(cropDuster);

        Field defaultField = new Field();
        CropRow<CornStalk> row1 = new CropRow<>();
        CropRow<TomatoPlant> row2 = new CropRow<>();
        CropRow<CornStalk> row3 = new CropRow<>();
        CropRow<TomatoPlant> row4 = new CropRow<>();
        CropRow<CornStalk> row5 = new CropRow<>();

        row1.add(new CornStalk(false, false));
        row2.add(new TomatoPlant(false, false));
        row3.add(new CornStalk(false, false));
        row4.add(new TomatoPlant(false, false));
        row5.add(new CornStalk(false, false));

        defaultField.addRow(row1);
        defaultField.addRow(row2);
        defaultField.addRow(row3);
        defaultField.addRow(row4);
        defaultField.addRow(row5);

        this.field = defaultField;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void addVehicle(FarmVehicle vehicle) {
        if (vehicle != null) {
            this.vehicles.add(vehicle);
        }
    }

    public void addAircraft(CropDuster aircraft) {
        if (aircraft != null) {
            this.aircraft.add(aircraft);
        }
    }

    public void addStable(Stable stable) {
        if (stable != null) {
            this.stables.add(stable);
        }
    }

    public void addChickenCoop(ChickenCoop coop) {
        if (coop != null) {
            this.chickenCoops.add(coop);
        }
    }

    public List<ChickenCoop> getChickenCoops() {
        return new ArrayList<>(chickenCoops);
    }

    public Stable getStable() {
        return stables.isEmpty() ? null : stables.get(0);
    }

    public List<Stable> getStables() {
        return new ArrayList<>(stables);
    }

    public Froilan getFroilan() {
        if (farmHouse == null) {
            return null;
        }
        return (Froilan) farmHouse.getFarmer("Froilan");
    }

    public Froilanda getFroilanda() {
        if (farmHouse == null) {
            return null;
        }
        return (Froilanda) farmHouse.getPilot("Froilanda");
    }
}
