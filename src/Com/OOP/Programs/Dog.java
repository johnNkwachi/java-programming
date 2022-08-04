package Com.OOP.Programs;

public class Dog extends Animal{
    private String sleep;

    public Dog(String eat, String bark, String walk, String sleep) {
        super(eat, bark, walk);
        this.sleep = sleep;
    }
}
