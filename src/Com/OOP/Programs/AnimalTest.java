package Com.OOP.Programs;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("eat", "bark", "walk", "colour");

        System.out.println("does a cat eat? " + cat.getEat());
    }
}
