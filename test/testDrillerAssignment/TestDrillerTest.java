package testDrillerAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    private TestDriller testDriller;
@BeforeEach

    @Test
    public void priceOfOneToFourCopies(){
        TestDriller testDriller = new TestDriller();
        int numberOfCopies  = testDriller.piceRange(3);
        assertEquals(6000,numberOfCopies);
    }

}