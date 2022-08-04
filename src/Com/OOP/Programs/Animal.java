package Com.OOP.Programs;

public class Animal {
    private String walk;
    private String eat;
    private String bark;

    public Animal(String eat, String bark, String walk){
        this.eat = eat;
        this.bark = bark;
        this.walk = walk;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}
