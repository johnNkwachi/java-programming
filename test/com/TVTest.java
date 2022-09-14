package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    TV tv = new TV();

    @BeforeEach
    public void setup(){
         tv = new TV();
    }

    @Test
    public void checkThatTvCanBeTurnOn(){
        tv.turnOn();
       Assertions.assertTrue(tv.turnOn());
    }
    @Test
    public void checkThatTvCanBeTurnedOff(){
        tv.turnOn();
        Assertions.assertTrue(tv.turnOn());

        tv.turnOff();
        assertFalse(tv.turnOff());
    }

    @Test
    public void checkThatChannelCanBeSet(){
        tv.turnOn();
        assertTrue(tv.turnOn());

        tv.setChannel(2);
        assertEquals(20, tv.setChannel(20));
    }
    @Test
    public void checkThatVolumeCanBeSet(){
        tv.turnOn();
        assertTrue(tv.turnOn());
        tv.setVolume(3);
        assertEquals(7,tv.setVolume(7));
    }
    @Test
    public void testThatVolumeCanBeIncreased(){
        tv.turnOn();
        assertTrue(tv.turnOn());

        tv.volumeUp(1);
        assertEquals( 3,tv.volumeUp(2));
        //System.out.println(tv.volumeUp(1));
    }
    @Test
    public void testThatVolumeCanBeDecreased(){
        tv.turnOn();
        assertTrue(tv.turnOn());
        tv.volumeUp(2);
        assertEquals(4, tv.volumeUp(3));

        tv.volumeDown(3);
        assertEquals( 3,tv.volumeDown(4));

    }

    @Test
    public void testThatChannelCanBeIncreased() {
        tv.turnOn();
        assertTrue(tv.turnOn());

//        tv.setChannel(2);
//        assertEquals(18, tv.setChannel(18));

        tv.channelUp(2);
        assertEquals(2, tv.channelUp(1));

    }

    @Test
    public void testThatChannelCanBeDecreased() {
        tv.turnOn();
        assertTrue(tv.turnOn());

        tv.channelUp(2);
        assertEquals(3, tv.channelUp(2));

        tv.channelDown(1);
        assertEquals(2, tv.channelDown(3));
    }





}