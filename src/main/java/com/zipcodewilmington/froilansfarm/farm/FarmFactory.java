package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilan;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilanda;
import java.util.stream.IntStream;

public class FarmFactory {

    public static Farm buildFroilanFarm() {
        Farm farm = new Farm();
        FarmHouse house = new FarmHouse();

        Froilan froilan = new Froilan();
        Froilanda froilanda = new Froilanda();

        house.addFarmer(froilan);
        house.addPilot(froilanda);
        farm.setFarmHouse(house);

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        IntStream.range(0, 4).forEach(i -> stable1.add(new Horse()));
        IntStream.range(0, 3).forEach(i -> stable2.add(new Horse()));
        IntStream.range(0, 3).forEach(i -> stable3.add(new Horse()));

        farm.addStable(stable1);
        farm.addStable(stable2);
        farm.addStable(stable3);

        return farm;
    }
}
