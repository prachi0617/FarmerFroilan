package com.zipcodewilmington.froilansfarm.sunday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SundayTest extends FarmTestBase {

    @Test
    void firstRowContainsCornStalkAfterPlanting() {
        CropRow<CornStalk> cropRow1 = new CropRow<>();
        froilan.plant(new CornStalk(), cropRow1);
        assertTrue(cropRow1.getCrops().get(0) instanceof CornStalk);
    }

    @Test
    void secondRowContainsTomatoPlantAfterPlanting() {
        CropRow<TomatoPlant> cropRow2 = new CropRow<>();
        froilan.plant(new TomatoPlant(), cropRow2);
        assertTrue(cropRow2.getCrops().get(0) instanceof TomatoPlant);
    }

    @Test
    void thirdRowContainsCropAfterPlanting() {
        Crop crop = new CornStalk();
        CropRow<Crop> cropRow3 = new CropRow<>();
        froilan.plant(crop, cropRow3);
        assertNotNull(cropRow3.getCrops().get(0));
    }

}
