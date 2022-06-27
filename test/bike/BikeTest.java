package bike;

import airconditional.Aircondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void initSetup() {
        bike = new Bike();
    }

    @Test
    public void tet_isOn() throws Exception {
        String result = bike.isOn("on");
        Assertions.assertEquals(result, "on");

    }

    @Test
    public void tet_isOnIsInvalid() throws Exception {
        String result = bike.isOn("ON");
        Assertions.assertEquals(result, "ON");
    }


    @Test
    public void test_isoff() throws Exception {
        String result = bike.isOff("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void tet_isOffIsInvalid() throws Exception {
        String result = bike.isOn("OFF");
        Assertions.assertEquals(result, "OFF");

    }
}