package com;

public class TV {
    private boolean on = false;

     int channel =1;
     int volume = 1;

    public TV() {

    }


    public boolean turnOn() {
        on = true;
        return true;
    }

    public boolean turnOff() {
        on = false;
        return false;
    }

    public int setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 22) {
            channel = newChannel;
        } else {
            throw new IllegalArgumentException("channel cant be greater than 22");
        }
        return newChannel;
    }

    public int setVolume(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7) {
            this.volume = volumeLevel;
        } else {
            throw new IllegalArgumentException("Volume cant be more than 7");
        }
        return volumeLevel;
    }

    public int volumeUp(int volumeLevel) {
        if (on && volumeLevel < 7)
             volume = volumeLevel++;
        return volumeLevel;
    }

    public int volumeDown(int volumeLevel) {
        if (on && volumeLevel > 1)
            volume = volumeLevel--;
        return volumeLevel;
    }

    public int channelUp(int channel) {
        if (on && channel < 22)
            channel++;
        return channel;
    }

    public int channelDown(int channel) {
        if (on && channel < 22)
            channel--;
        return channel;
    }
}
//    public boolean on() {
//        return on;
//    }

