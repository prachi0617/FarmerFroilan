package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        CropRow<CornStalk> cropRow = new CropRow<>();
        cropRow.add(new CornStalk(false, false));
        cropDuster.fertilize(cropRow);
    }

    @Test
    void cropRowIsFertilizedAfterCropDusterPasses() {
        CropRow<CornStalk> cropRow = new CropRow<>();
        cropRow.add(new CornStalk(false, false));
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
