package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import org.junit.jupiter.api.Test;

public class CropDusterTest extends FarmTestBase {

    @Test
    void cropDusterCanFly() {
        cropDuster.fly();
    }

    @Test
    void cropDusterCanOperate() {
        cropDuster.operate(farm);
    }

    @Test
    void cropDusterFertilizesCropRow() {
        cropDuster.fertilize(cropRow);
    }

    @Test
    void cropRowIsFertilizedAfterCropDusterPasses() {
        cropDuster.fertilize(cropRow);
        for (Crop crop : cropRow.getCrops()) {
            assertTrue(crop.hasBeenFertilized());
        }
    }

    @Test
    void cropDusterMakesNoise() {
        assertNotNull(cropDuster.makeNoise());
    }

}
