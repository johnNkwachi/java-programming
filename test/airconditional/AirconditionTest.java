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

}