package Com.OOP.Programs;

import java.util.Date;

public class SimpleGeometricObject {
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(String colour, boolean filled, Date dateCreated) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
//color: String The color of the object (default: white).
//        -filled: boolean Indicates whether the object is filled with a color (default: false).
//        -dateCreated: java.util.Date The date when the object was created.
//        +GeometricObject() Creates a GeometricObject.
//        +GeometricObject(color: String,
//        filled: boolean)
//        +getColor(): String
//        +setColor(color: String): void Creates a GeometricObject with the specified color and filled
//        values.
//        Returns the color.
//        +isFilled(): boolean
//        +setFilled(filled: boolean): void Returns the filled property.
//        +getDateCreated(): java.util.Date Returns the dateCreated.
////        +toString(): Strin