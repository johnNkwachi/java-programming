package Com.OOP.Programs;

public class Dog extends Animal{
    private String bark;

    public Dog(String name, String hunger, String age, String bark) {
        super(name, hunger, age);
        this.bark = bark;
    }
}
