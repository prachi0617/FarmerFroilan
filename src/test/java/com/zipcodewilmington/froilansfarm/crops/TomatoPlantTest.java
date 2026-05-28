package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {

    @Test
    public void tomatoPlantShouldExistTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(false);

        assertNotNull(tomatoPlant);
    }

    @Test
    public void tomatoPlantShouldYieldTomatoWhenNotFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(false);

        Edible edible = tomatoPlant.yield();

        assertNotNull(edible);
    }

    @Test
    public void tomatoPlantShouldNotYieldTomatoWhenFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(true);

        Edible edible = tomatoPlant.yield();

        assertNull(edible);
    }
}