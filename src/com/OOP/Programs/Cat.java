package Com.OOP.Programs;

public class Cat extends Animal{

    private String colour;

    public Cat(String name, String hunger, String age, String colour) {
        super(name, hunger, age);
        this.colour = colour;
    }
}
