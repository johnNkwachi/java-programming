package Classes;

public class Cat {
    private String name;
    private int age;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public boolean equals(Object obj){
        Cat other = (Cat)obj;
        if(this==obj) return true;
        if(!this.getClass().equals(obj.getClass())) return false;
        return this.name.equals(other.getName())
                && this.age == other.getAge()
                && this.colour.equals(other.getColour());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
