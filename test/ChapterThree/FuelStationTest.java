package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelStationTest {
private FuelStation fuelStation;
@BeforeEach
public void setUp(){
    fuelStation = new FuelStation("yaba", "fuel", 2,
            500,0.03);
}
    @Test
    public void testThatForDiscount() {
        fuelStation.setQuantity(100);
        fuelStation.setPricePerLiter(12.33);
        fuelStation.calculateDiscount(1.5);
        assertEquals(1233.0, fuelStation.getPurchaseAmount());
    }

}