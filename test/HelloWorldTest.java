import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    private HelloWorld helloWorld;

    @BeforeEach
    public void initSetUp(){
        helloWorld = new HelloWorld();
    }

    @Test
    public void test_printHelloWorld(){
        String helloVariable =helloWorld.printHelloWorld("Hello World");
        Assertions.assertEquals(helloVariable, "Hello World");

    }
}