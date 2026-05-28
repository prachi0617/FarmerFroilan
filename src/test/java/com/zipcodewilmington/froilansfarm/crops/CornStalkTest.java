package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.CornStalk;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {

    @Test
    public void cornStalkShouldExistTest() {
        CornStalk cornStalk = new CornStalk(false);

        assertNotNull(cornStalk);
    }

    @Test
    public void cornStalkShouldYieldCornWhenNotFertilizedTest() {
        CornStalk cornStalk = new CornStalk(false);

        Edible edible = cornStalk.yield();

        assertNotNull(edible);
    }

    @Test
    public void cornStalkShouldNotYieldCornWhenFertilizedTest() {
        CornStalk cornStalk = new CornStalk(true);

        Edible edible = cornStalk.yield();

        assertNull(edible);
    }
}