package com.zipcodewilmington.froilansfarm.sunday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SundayTest extends FarmTestBase {

    @Test
    void sundayPlantingRoutine() {

        froilan.plant(new CornStalk(), cropRow1);
        froilan.plant(new TomatoPlant(), cropRow2);
        froilan.plant(new ArbitraryCrop(), cropRow3);

        assertEquals(1, cropRow1.getCrops().size());
        assertEquals(1, cropRow2.getCrops().size());
        assertEquals(1, cropRow3.getCrops().size());
    }

    //INSTANCE TEST
    @Test
    void thirdRowAcceptsAnyCropType() {
        Crop crop = new ArbitraryCrop();

        froilan.plant(crop, cropRow3);

        assertTrue(cropRow3.getCrops().contains(crop));
    }
}
