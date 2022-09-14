package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionalTest {
    AirConditional Ac = new AirConditional();

    @BeforeEach
    public void setUp(){
        Ac.isOn();
    }

    @Test
    public void testThatAcIsOn(){
        Ac.isOn();
        assertTrue(Ac.isOn());
    }

    @Test
    public void testThatAcCanBeTurnedOn(){
        Ac.turnOn();
        assertTrue(Ac.isOn());
    }
    @Test
    public void testThatAcCanBeTurnedOff(){
        Ac.turnOff();
        assertFalse(Ac.isOn());
    }
    @Test
    public void testThatAcCanIncreaseTemperature(){
        Ac.increaseTemperature();
       // Ac.increaseTemperature();
        assertEquals(17,Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(18,Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(19,Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(20, Ac.getTemperature());

    }
    @Test
    public void testThatAcCanBeDecreased(){
        Ac.increaseTemperature();
        assertEquals(17, Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(18,Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(19, Ac.getTemperature());
        Ac.decreaseTemperature();
        assertEquals(18, Ac.getTemperature());
        Ac.decreaseTemperature();
        assertEquals(17, Ac.getTemperature());
        Ac.decreaseTemperature();
        assertEquals(16, Ac.getTemperature());

    }

    @Test
    public void testThatAcCannnotIncreaseMoreThan30() {
        Ac.turnOn();
        for (int i = 0; i < 13; i++) {
            Ac.increaseTemperature();
        }
        assertEquals(29, Ac.getTemperature());
        Ac.increaseTemperature();
        assertEquals(30, Ac.getTemperature());
//        Ac.increaseTemperature();
//        assertEquals(31, Ac.getTemperature());
    }

    @Test
    public void checkThatAcCannotDecreasedBelow16(){
        Ac.turnOn();
        Ac.increaseTemperature();
        assertEquals(17, Ac.getTemperature());

        Ac.decreaseTemperature();
        assertEquals(16, Ac.getTemperature());
//        Ac.decreaseTemperature();
//        assertEquals(15, Ac.getTemperature());
    }
}