package com.zipcodewilmington.froilansfarm.routines;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilan;
import com.zipcodewilmington.froilansfarm.farmmembers.Froilanda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorningRoutineTest {

    @Test
    public void froilanRidesAllHorses() {
        Farm farm = new Farm();
        Stable stable = farm.getStable();
        Froilan froilan = farm.getFroilan();

        for (Horse horse : stable.getHorses()) {
            froilan.mount(horse);
            froilan.ride(horse);
            froilan.dismount(horse);

            assertFalse(horse.isMounted());
        }
    }

    @Test
    public void froilandaRidesAllHorses() {
        Farm farm = new Farm();
        Stable stable = farm.getStable();
        Froilanda froilanda = farm.getFroilanda();

        for (Horse horse : stable.getHorses()) {
            froilanda.mount(horse);
            froilanda.ride(horse);
            froilanda.dismount(horse);

            assertFalse(horse.isMounted());
        }
    }

    @Test
    public void horsesEatThreeEarCorn() {
        Farm farm = new Farm();
        Stable stable = farm.getStable();

        for (Horse horse : stable.getHorses()) {
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());

            assertEquals(3, horse.getMealsEaten().size());
        }
    }

    @Test
    public void froilanEatsBreakfast() {
        Farm farm = new Farm();
        Froilan froilan = farm.getFroilan();

        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());

        assertFalse(froilan.isHungry());
    }

    @Test
    public void froilandaEatsBreakfast() {
        Farm farm = new Farm();
        Froilanda froilanda = farm.getFroilanda();

        froilanda.eat(new Egg());
        froilanda.eat(new Tomato());

        assertFalse(froilanda.isHungry());
    }
}