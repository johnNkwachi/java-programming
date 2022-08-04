package Com.OOP.Programs;

public class Cat extends Animal{

    private String colour;

    public Cat(String eat, String bark, String walk, String colour) {
        super(eat, bark, walk);
        this.colour = colour;
    }
}
