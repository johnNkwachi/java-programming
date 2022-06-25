package airconditional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionTest {

    private Aircondition aircondition;


    @BeforeEach
    public void initSetup(){
        aircondition = new Aircondition();
    }

    @Test
    public void test_isOn() throws Exception {
        String result = aircondition.isOn("on");
        Assertions.assertEquals(result, "on");

    }

    @Test
    public void test_isoff() throws Exception {
        String result = aircondition.isOff("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void test_Temperature() throws Exception {
        int result = aircondition.increaseTemperature(10);
        Assertions.assertEquals(result, 10);

    }

    @Test
    public void test_decreaseTemperature() throws Exception {
        int result = aircondition.decreaseTemperature(16);
        Assertions.assertEquals(result, 16);

}}
