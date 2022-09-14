package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest{
     Turtle ijapa;

     @BeforeEach
     public void setIjapa(){
         ijapa = new Turtle();
     }

    @Test
    public void testThatTurtleCLassExist(){
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUp(){
      ijapa.penUp();
      assertTrue(ijapa.PenIsUp());
    }

    @Test
    public void turtleCanMovePenDown(){
         ijapa.penUp();
         assertTrue(ijapa.PenIsUp());

         ijapa.penDown();
         assertFalse(ijapa.PenIsUp());
    }

}