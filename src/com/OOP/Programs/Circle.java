package Com.OOP.Programs;

public class Circle {
    double radius = 1;
    static int numberOfObject = 0;

    public Circle(){
        numberOfObject++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObject++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
