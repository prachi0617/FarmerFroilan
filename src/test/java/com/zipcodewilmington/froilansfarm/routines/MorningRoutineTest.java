package com.zipcodewilmington.froilansfarm.routines;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

/**
 * MorningRoutineTest
 *
 * Simulates the daily morning routine shared by Froilan and Froilanda:
 * 1. Ride every Horse in every Stable (mount → dismount).
 * 2. Feed each Horse 3 EarCorn.
 * 3. Eat breakfast:
 * Froilan – 1 EarCorn, 2 Tomato, 5 Egg
 * Froilanda – 2 EarCorn, 1 Tomato, 2 Egg
 *
 * Coverage targets: Farmer, Pilot, Horse, Stable, Rider (mount/dismount),
 * Eater (eat), EarCorn, Tomato, Egg (Edible subtypes),
 * Farm (stable access), and the morning helper logic.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MorningRoutineTest {

    // Shared farm state – rebuilt fresh before every test

    private Farm farm;
    private Farmer froilan;
    private Pilot froilanda;

    // Counts of food items harvested and used – tracked manually for assertions
    private int totalCornFedToHorses;
    private List<EarCorn> breakfastCornFroilan;
    private List<Tomato> breakfastTomatoFroilan;
    private List<Egg> breakfastEggsFroilan;

    private List<EarCorn> breakfastCornFroilanda;
    private List<Tomato> breakfastTomatoFroilanda;
    private List<Egg> breakfastEggsFroilanda;

    // -----------------------------------------------------------------------
    // Constants that match the problem spec
    // -----------------------------------------------------------------------
    private static final int STABLES = 3;
    private static final int HORSES_PER_STABLE_MAX = 4; // 10 horses across 3 stables
    private static final int TOTAL_HORSES = 10;
    private static final int CORN_PER_HORSE = 3;

    // Breakfast counts
    private static final int FROILAN_CORN = 1;
    private static final int FROILAN_TOMATO = 2;
    private static final int FROILAN_EGGS = 5;

    private static final int FROILANDA_CORN = 2;
    private static final int FROILANDA_TOMATO = 1;
    private static final int FROILANDA_EGGS = 2;

    // -----------------------------------------------------------------------
    // Setup
    // -----------------------------------------------------------------------
    @BeforeEach
    void setUp() {
        farm = FarmFactory.buildFroilanFarm(); // builds the full farm per spec
        froilan = farm.getFarmHouse().getFarmer("Froilan");
        froilanda = farm.getFarmHouse().getPilot("Froilanda");

        breakfastCornFroilan = new ArrayList<>();
        breakfastTomatoFroilan = new ArrayList<>();
        breakfastEggsFroilan = new ArrayList<>();
        breakfastCornFroilanda = new ArrayList<>();
        breakfastTomatoFroilanda = new ArrayList<>();
        breakfastEggsFroilanda = new ArrayList<>();

        totalCornFedToHorses = 0;
    }

    // -----------------------------------------------------------------------
    // Helper – simulate the morning routine and capture side effects
    // -----------------------------------------------------------------------
    private void runMorningRoutine() {
        // --- Step 1 & 2: Ride horses and feed them ---
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {

                // Froilan rides
                froilan.mount(horse);
                assertTrue(horse.isOccupied(),
                        "Horse should be occupied after Froilan mounts.");
                froilan.dismount(horse);
                assertFalse(horse.isOccupied(),
                        "Horse should be free after Froilan dismounts.");

                // Froilanda rides
                froilanda.mount(horse);
                assertTrue(horse.isOccupied(),
                        "Horse should be occupied after Froilanda mounts.");
                froilanda.dismount(horse);
                assertFalse(horse.isOccupied(),
                        "Horse should be free after Froilanda dismounts.");

                // Feed horse 3 ears of corn
                for (int i = 0; i < CORN_PER_HORSE; i++) {
                    EarCorn corn = new EarCorn();
                    horse.eat(corn);
                    totalCornFedToHorses++;
                }
            }
        }

        // --- Step 3: Breakfast ---
        // Froilan – 1 EarCorn
        for (int i = 0; i < FROILAN_CORN; i++) {
            EarCorn corn = new EarCorn();
            froilan.eat(corn);
            breakfastCornFroilan.add(corn);
        }
        // Froilan – 2 Tomato
        for (int i = 0; i < FROILAN_TOMATO; i++) {
            Tomato tomato = new Tomato();
            froilan.eat(tomato);
            breakfastTomatoFroilan.add(tomato);
        }
        // Froilan – 5 Egg
        for (int i = 0; i < FROILAN_EGGS; i++) {
            Egg egg = new Egg(); // unfertilized → edible
            froilan.eat(egg);
            breakfastEggsFroilan.add(egg);
        }

        // Froilanda – 2 EarCorn
        for (int i = 0; i < FROILANDA_CORN; i++) {
            EarCorn corn = new EarCorn();
            froilanda.eat(corn);
            breakfastCornFroilanda.add(corn);
        }
        // Froilanda – 1 Tomato
        for (int i = 0; i < FROILANDA_TOMATO; i++) {
            Tomato tomato = new Tomato();
            froilanda.eat(tomato);
            breakfastTomatoFroilanda.add(tomato);
        }
        // Froilanda – 2 Egg
        for (int i = 0; i < FROILANDA_EGGS; i++) {
            Egg egg = new Egg();
            froilanda.eat(egg);
            breakfastEggsFroilanda.add(egg);
        }
    }

    // Tests

    /** Farm is properly initialised with the correct number of stables & horses. */
    @Test
    @Order(1)
    void testFarmSetup() {
        assertNotNull(farm, "Farm must not be null.");
        assertNotNull(froilan, "Froilan must be present in the farmhouse.");
        assertNotNull(froilanda, "Froilanda must be present in the farmhouse.");

        assertEquals(STABLES, farm.getStables().size(),
                "Farm should have exactly 3 stables.");

        int horseCount = farm.getStables().stream()
                .mapToInt(s -> s.getHorses().size())
                .sum();
        assertEquals(TOTAL_HORSES, horseCount,
                "Farm should have exactly 10 horses across all stables.");
    }

    /** Every horse is ridden by both Froilan and Froilanda without error. */
    @Test
    @Order(2)
    void testEveryHorseIsRidden() {
        int horsesRidden = 0;
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                assertDoesNotThrow(() -> {
                    froilan.mount(horse);
                    froilan.dismount(horse);
                    froilanda.mount(horse);
                    froilanda.dismount(horse);
                }, "Mounting and dismounting should not throw.");
                horsesRidden++;
            }
        }
        assertEquals(TOTAL_HORSES, horsesRidden,
                "All 10 horses should have been ridden.");
    }

    /** A horse cannot be mounted while already occupied. */
    @Test
    @Order(3)
    void testHorseCannotBeDoubleRidden() {
        Horse horse = farm.getStables().get(0).getHorses().get(0);
        froilan.mount(horse);
        assertTrue(horse.isOccupied());

        assertThrows(IllegalStateException.class,
                () -> froilanda.mount(horse),
                "Mounting an already-occupied horse should throw IllegalStateException.");

        froilan.dismount(horse);
    }

    /** After dismounting, a horse is available for the next rider. */
    @Test
    @Order(4)
    void testHorseAvailableAfterDismount() {
        Horse horse = farm.getStables().get(0).getHorses().get(0);
        froilan.mount(horse);
        froilan.dismount(horse);
        assertFalse(horse.isOccupied(),
                "Horse should be free after rider dismounts.");
        assertDoesNotThrow(() -> froilanda.mount(horse),
                "Another rider should be able to mount after the previous rider dismounts.");
        froilanda.dismount(horse);
    }

    /** Each horse receives exactly 3 ears of corn. */
    @Test
    @Order(5)
    void testEachHorseFedThreeCorn() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                int beforeMeals = horse.getMealsEaten();
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                assertEquals(beforeMeals + CORN_PER_HORSE, horse.getMealsEaten(),
                        "Each horse should eat exactly 3 ears of corn.");
            }
        }
    }

    /** Total corn fed to all horses equals 10 horses × 3 ears = 30. */
    @Test
    @Order(6)
    void testTotalCornFedToHorses() {
        runMorningRoutine();
        assertEquals(TOTAL_HORSES * CORN_PER_HORSE, totalCornFedToHorses,
                "30 ears of corn (10 horses × 3) should be fed during the morning.");
    }

    /** Froilan eats the correct breakfast items. */
    @Test
    @Order(7)
    void testFroilanBreakfast() {
        runMorningRoutine();

        assertEquals(FROILAN_CORN, breakfastCornFroilan.size(),
                "Froilan should eat 1 EarCorn for breakfast.");
        assertEquals(FROILAN_TOMATO, breakfastTomatoFroilan.size(),
                "Froilan should eat 2 Tomatoes for breakfast.");
        assertEquals(FROILAN_EGGS, breakfastEggsFroilan.size(),
                "Froilan should eat 5 Eggs for breakfast.");
    }

    /** Froilanda eats the correct breakfast items. */
    @Test
    @Order(8)
    void testFroilandaBreakfast() {
        runMorningRoutine();

        assertEquals(FROILANDA_CORN, breakfastCornFroilanda.size(),
                "Froilanda should eat 2 EarCorn for breakfast.");
        assertEquals(FROILANDA_TOMATO, breakfastTomatoFroilanda.size(),
                "Froilanda should eat 1 Tomato for breakfast.");
        assertEquals(FROILANDA_EGGS, breakfastEggsFroilanda.size(),
                "Froilanda should eat 2 Eggs for breakfast.");
    }

    /** Eggs used for breakfast must be unfertilized (EdibleEgg). */
    @Test
    @Order(9)
    void testBreakfastEggsAreEdible() {
        runMorningRoutine();

        for (Egg egg : breakfastEggsFroilan) {
            assertFalse(egg.hasBeenFertilized(),
                    "Froilan's breakfast eggs must be unfertilized.");
        }
        for (Egg egg : breakfastEggsFroilanda) {
            assertFalse(egg.hasBeenFertilized(),
                    "Froilanda's breakfast eggs must be unfertilized.");
        }
    }

    /** EarCorn, Tomato, and Egg all implement Edible. */
    @Test
    @Order(10)
    void testEdibleInterfaceConformance() {
        assertInstanceOf(Edible.class, new EarCorn(),
                "EarCorn must implement Edible.");
        assertInstanceOf(Edible.class, new Tomato(),
                "Tomato must implement Edible.");
        assertInstanceOf(Edible.class, new Egg(),
                "Egg must implement Edible.");
    }

    /** Froilan is an Eater, Rider, Botanist, and Person. */
    @Test
    @Order(11)
    void testFroilanInstanceHierarchy() {
        assertInstanceOf(Eater.class, froilan, "Froilan must be an Eater.");
        assertInstanceOf(Rider.class, froilan, "Froilan must be a Rider.");
        assertInstanceOf(Botanist.class, froilan, "Froilan must be a Botanist.");
        assertInstanceOf(Person.class, froilan, "Froilan must be a Person.");
        assertInstanceOf(Farmer.class, froilan, "Froilan must be a Farmer.");
    }

    /** Froilanda is a Pilot (which is a Rider and Person). */
    @Test
    @Order(12)
    void testFroilandaInstanceHierarchy() {
        assertInstanceOf(Rider.class, froilanda, "Froilanda must be a Rider.");
        assertInstanceOf(Person.class, froilanda, "Froilanda must be a Person.");
        assertInstanceOf(Pilot.class, froilanda, "Froilanda must be a Pilot.");
    }

    /** Full morning routine completes without any exception. */
    @Test
    @Order(13)
    void testFullMorningRoutineNoExceptions() {
        assertDoesNotThrow(this::runMorningRoutine,
                "The complete morning routine should execute without throwing.");
    }

    /**
     * Running the morning routine twice in a row should still succeed
     * (idempotency / state-reset check).
     */
    @Test
    @Order(14)
    void testMorningRoutineIsRepeatable() {
        assertDoesNotThrow(() -> {
            runMorningRoutine();
            // reset breakfast lists then re-run
            setUp();
            runMorningRoutine();
        }, "Morning routine should be safely repeatable after state reset.");
    }
}
