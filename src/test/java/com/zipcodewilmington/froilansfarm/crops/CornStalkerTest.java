package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkerTest {

    @Test
    public void cornStalkShouldNotYieldWhenNotFertilizedAndNotHarvestedTest() {
        CornStalk cornStalk = new CornStalk(false, false);

        assertNull(cornStalk.yield());
    }

    @Test
    public void cornStalkShouldNotYieldWhenFertilizedButNotHarvestedTest() {
        CornStalk cornStalk = new CornStalk(true, false);

        assertNull(cornStalk.yield());
    }

    @Test
    public void cornStalkShouldNotYieldWhenHarvestedButNotFertilizedTest() {
        CornStalk cornStalk = new CornStalk(false, true);

        assertNull(cornStalk.yield());
    }

    @Test
    public void cornStalkShouldYieldEarCornWhenFertilizedAndHarvestedTest() {
        CornStalk cornStalk = new CornStalk(true, true);

        assertNotNull(cornStalk.yield());
    }
}