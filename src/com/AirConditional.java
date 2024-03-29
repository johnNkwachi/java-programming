package com;

public class AirConditional {
    private boolean isOn = true;
    private int temperature =16;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(){
        if (isOn()){
            if (temperature < 30) temperature++;
        }
    }

    public void decreaseTemperature() {
        if (isOn()){
            if (temperature > 16 && temperature <= 30) temperature--;
        }
    }
}
