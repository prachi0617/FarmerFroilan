package com.zipcodewilmington.froilansfarm.sunday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SundayTest extends FarmTestBase {

    @Test
    void firstRowContainsCornStalkAfterPlanting() {
        froilan.plant(new CornStalk(), cropRow1);
        assertTrue(cropRow1.getCrops().get(0) instanceof CornStalk);
    }

    @Test
    void secondRowContainsTomatoPlantAfterPlanting() {
        froilan.plant(new TomatoPlant(), cropRow2);
        assertTrue(cropRow2.getCrops().get(0) instanceof TomatoPlant);
    }

    @Test
    void thirdRowContainsCropAfterPlanting() {
        froilan.plant(crop, cropRow3);
        assertNotNull(cropRow3.getCrops().get(0));
    }

}
