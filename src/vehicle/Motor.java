package vehicle;

public class Motor {

    private String brand;
    private int plateNumber;
    private String color;
    private String brake;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }


    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int plateNumber(){
        return plateNumber;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color(){
        return color;


    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        if (brake == "Stop"){
            System.out.println("The brake has stopped.");
        }
        this.brake = brake;
    }

    public  String brake(){

        return brake;
    }



}
