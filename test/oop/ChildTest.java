package oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildTest {

    public Child child;

    @BeforeEach
    void initSetUp(){
        child = new Child();

    }

    @Test
    public void test_ChildName() throws Exception {
        String result = child.name("Kelechi");
        assertEquals(result, "Kelechi");
    }

}