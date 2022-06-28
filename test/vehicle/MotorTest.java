package vehicle;

import airconditional.Aircondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    private Motor motor;

    @BeforeEach
    public void initSetup() {
        motor = new Motor();
    }


    @Test
    public void test_getAndSetBrand() throws Exception {
        motor.setBrand("yaba");
        String result = motor.getBrand();
        Assertions.assertEquals(result, "yaba");
    }


    @Test
    public void test_getAndSetPlateNumber() throws Exception {
        motor.setPlateNumber(12345);
        int result = motor.plateNumber();
        Assertions.assertEquals(result, 12345);
    }

    @Test
    public void test_getAndSetColor() throws Exception {
        motor.setColor("white");
        String result = motor.getColor();
        Assertions.assertEquals(result, "white");
    }


    @Test
    public void test_getAndSetBrake() throws Exception {
        motor.setBrake("Stop");
        String result = motor.getBrake();
        Assertions.assertEquals(result, "Stop");
    }


}