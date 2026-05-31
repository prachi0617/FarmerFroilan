package com.zipcodewilmington.froilansfarm.crop;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

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