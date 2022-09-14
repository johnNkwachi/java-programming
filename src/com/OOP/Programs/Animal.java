package Com.OOP.Programs;

public class Animal {
    private String name;
    private String hunger;
    private String age;

    public Animal(String name, String hunger, String age) {
        this.name = name;
        this.hunger = hunger;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHunger() {
        return hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}