package com.Duck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    @Test
    public void duckTest(){
        Fly1 fly1 = new Fly1();
        Fly2 fly2 = new Fly2();
        Quack1 quack1 = new Quack1();
        Quack2 quack2 = new Quack2();

        Duck pepeye = new Duck(quack1, fly1);
        pepeye.fly();
        pepeye.setFly(fly2);
        pepeye.fly();
    }

}