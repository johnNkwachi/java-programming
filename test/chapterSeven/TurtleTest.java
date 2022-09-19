package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp(){
        turtle = new Turtle();
    }
    @Test
    public void turtleExist() {
        assertNotNull(turtle);
    }
    @Test
    public void turtleHasPen(){
        assertNotNull(turtle);
        assertEquals(0, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());
        assertNotNull(turtle.getTurtlePen());
    }
    @Test
    public void turtlePenIsUp(){
        turtleHasPen();
        assertNotNull(turtle.getTurtlePen().getPosition());
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPosition());
    }
    @Test
    public void moveForward(){
        turtlePenIsUp();
        turtle.turtleMovement(9);
        assertEquals(0, turtle.getyCoordinate());
        assertEquals(8, turtle.getxCoordinate());
    }
}