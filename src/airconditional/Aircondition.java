package airconditional;

public class Aircondition {


    public String isOn(String on) throws Exception {
        if(on == "on"){
            System.out.println("Ac is on");
        }
        else {
            throw new Exception("Please input 'on'");
        }
        return on;
    }

    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("Ac is off");
        } else {
            throw new Exception("Please input 'off'");
        }
        return off;
    }

    public int increaseTemperature(int temp) throws Exception {
        if(temp>30) {
//            throw new Exception("invalid temp");
            temp = 30;
        }
    else{
            System.out.println("Temperature is: "+ temp);
        }
    return temp;
     }

    public int decreaseTemperature(int temp) throws Exception {
        if(temp>16) {
    //        throw new Exception("invalid temp");
            temp = 16;
        }
        else{
            System.out.println("Temperature is: "+ temp);
        }
        return temp;
    }
    }

