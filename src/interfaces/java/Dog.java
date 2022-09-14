package interfaces.java;

public class Dog extends Animal implements Edible{
    public static void main(String[] args) {

    }
    @Override
    public void makeNoise() {
        System.out.println("moooooooooooooooooooooooooo");
    }


    @Override
    public void eat() {
        System.out.println("I love bones");

    }
}
