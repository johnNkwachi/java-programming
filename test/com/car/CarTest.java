package com.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car Benz = new Car("xy", "2019", 2000);
    Car Honda = new Car("yx", "2020", 1000);

    @Test
    public void toCheckDiscountOf_A_Car(){
        //check
        Benz.getDiscount(200);
        assertEquals(1800, Benz.getDiscount(200));
    }



}