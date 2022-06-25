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
}
