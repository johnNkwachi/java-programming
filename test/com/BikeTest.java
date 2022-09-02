package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

class BikeTest {
   Bike bike = new Bike();

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }
    @Test
    public void testThatTheBikeCanBeTurnedOn(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }


    @Test
    public void testThatTheBikeCanBeTurnedOff(){
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOn_AndTurnedOff(){
        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());
    }
    @Test
    public void testForBikeAcceleratedOnGearOne(){
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(4, bike.getSpeed());
    }
    @Test
    public void testBikeWillNotAccelerateWhenOffTest(){
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }

        assertEquals(20, bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest(){
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(25, bike.getSpeed());
        assertEquals(2, bike.getGear());

    }
    @Test
    public void bikeCanChangeFromGearTwoToGearThree(){
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29,bike.getSpeed());
        assertEquals(2, bike.getGear());
        bike.increaseSpeed();
        assertEquals(3, bike.getGear());
    }

    @Test
    public void bikeCanChangeFromGearThreeToGearFour() {
        bike.turnOn();
        for (int i = 0; i < 29; i++) {
            bike.increaseSpeed();
        }

        assertEquals(40, bike.getSpeed());
        assertEquals(3, bike.getGear());
        bike.increaseSpeed();
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());

        }
        @Test
        public void bikeCanDeccelarateOnGearOne () {
            bike.turnOn();
            for (int i = 0; i < 20; i++) {
                bike.increaseSpeed();
            }

            assertEquals(1, bike.getGear());
            bike.decreaseSpeed();
            assertEquals(19, bike.getSpeed());
        }

        @Test
        public void bikeCanDeccelerateOnGearTwo(){
            bike.turnOn();
            for (int i = 0; i < 21; i++) {
                bike.increaseSpeed();
            }

            assertEquals(2, bike.getGear());
            bike.decreaseSpeed();
            assertEquals(19, bike.getSpeed());
            assertEquals(1, bike.getGear());
        }

        @Test
        public void bikeCanDeccelerateOnGearThree(){
            bike.turnOn();
            for (int i = 0; i < 26; i++) {
                bike.increaseSpeed();
            }

            assertEquals(3, bike.getGear());
            bike.decreaseSpeed();
            assertEquals(28, bike.getSpeed());
            assertEquals(2, bike.getGear());
        }

        @Test
        public void bikeCanDeccelerateOnGearFour () {
            bike.turnOn();
            for (int i = 0; i < 30; i++) {
                bike.increaseSpeed();
            }

            assertEquals(4, bike.getGear());
            assertEquals(43, bike.getSpeed());

            for (int i = 0; i < 1; i++) {
                bike.decreaseSpeed();
            }

            assertEquals(39, bike.getSpeed());
            assertEquals(3, bike.getGear());

            for (int i = 0; i < 1; i++) {
                bike.decreaseSpeed();
            }

            assertEquals(36, bike.getSpeed());
            assertEquals(3, bike.getGear());
    }
}
