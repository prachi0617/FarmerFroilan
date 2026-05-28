package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import org.junit.jupiter.api.Test;

public class TractorTest extends FarmTestBase {

    @Test
    void tractorCanOperate() {
        tractor.operate(farm);
    }

    @Test
    void tractorHarvestsCrop() {
        tractor.harvest(crop);
    }

    @Test
    void cropIsHarvestedAfterTractorHarvests() {
        tractor.harvest(crop);
        assertTrue(crop.isHarvested());
    }

    @Test
    void tractorMakesNoise() {
        assertNotNull(tractor.makeNoise());
    }

}
