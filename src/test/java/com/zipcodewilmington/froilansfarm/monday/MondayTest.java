package com.zipcodewilmington.froilansfarm.monday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MondayTest extends FarmTestBase {

    @Test
    void cropDusterCanFlyOverField() {
        froilanda.fly();
    }

    @Test
    void everyCropRowIsFertilizedAfterCropDusterPass() {
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropDuster.fertilize(cropRow);
            for (Crop crop : cropRow.getCrops()) {
                assertTrue(crop.hasBeenFertilized());
            }
        }
    }

}
