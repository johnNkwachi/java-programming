package bike;

import java.sql.SQLOutput;
import java.util.Objects;

public class Bike {

    private int gear;

    public String isOn(String on) throws Exception {
        if (Objects.equals(on, "on")) {
            System.out.println("Bike is on");
        } else {
            throw new Exception("Please input 'on'");
        }
        return on;
    }

    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("Bike is off");
        } else {
            throw new Exception("Please input 'off'");
        }
        return off;
    }


    public int gearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1) {
            System.out.println("Hello you are in gear one");
        }
        else {
            throw new Exception("Not on gear 1");
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit++;
        }
        if (speedLimit > 20 || speedLimit < 0) {
            throw new Exception("Invalid limit");
        }
            return speedLimit;

    }

}
