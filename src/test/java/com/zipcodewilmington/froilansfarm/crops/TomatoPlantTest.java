package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.animal.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {

    @Test
    public void tomatoPlantShouldNotYieldWhenNotFertilizedAndNotHarvestedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(false, false);

        assertNull(tomatoPlant.yield());
    }

    @Test
    public void tomatoPlantShouldNotYieldWhenFertilizedButNotHarvestedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(true, false);

        assertNull(tomatoPlant.yield());
    }

    @Test
    public void tomatoPlantShouldNotYieldWhenHarvestedButNotFertilizedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(false, true);

        assertNull(tomatoPlant.yield());
    }

    @Test
    public void tomatoPlantShouldYieldTomatoWhenFertilizedAndHarvestedTest() {
        TomatoPlant tomatoPlant = new TomatoPlant(true, true);

        assertNotNull(tomatoPlant.yield());
    }
}