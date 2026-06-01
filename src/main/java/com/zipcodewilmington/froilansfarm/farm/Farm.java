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

public class Farm {

    private FarmHouse farmHouse;
    private Field field;
    private final List<Stable> stables = new ArrayList<>();
    private final List<FarmVehicle> vehicles = new ArrayList<>();
    private final List<CropDuster> aircraft = new ArrayList<>();

    public Farm() {
        FarmHouse house = new FarmHouse();
        Froilan froilan = new Froilan();
        Froilanda froilanda = new Froilanda();
        house.addFarmer(froilan);
        house.addPilot(froilanda);
        this.farmHouse = house;

        Stable stable = new Stable();
        stable.add(new Horse());
        addStable(stable);

        Field defaultField = new Field();
        CropRow<CornStalk> cornRow = new CropRow<>();
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        cornRow.add(new CornStalk(false, false));
        tomatoRow.add(new TomatoPlant(false, false));
        defaultField.addRow(cornRow);
        defaultField.addRow(tomatoRow);
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
