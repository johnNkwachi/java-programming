package chapterSeven;

public class Turtle {
    private Pen turtlePen;
    private int xCoordinate;
    private int yCoordinate;


    public Turtle(){
    turtlePen = new Pen();
}
    public Turtle(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public void turtleMovement(int numberOfMovement){
        xCoordinate = numberOfMovement -1;

    }
    public Pen getTurtlePen(){
        return turtlePen;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
