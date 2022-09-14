package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PetrolPurchaseTest {

    PetrolPurchase CoinOil = new PetrolPurchase("yaba", "fuel", 5,
            1000, 2);

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testThatOneCanPurchaseFuel(){
        PetrolPurchase CoinOil = new PetrolPurchase("yaba", "fuel", 2, 1000, 10.0);
        CoinOil.getPurchaseAmount();
        assertEquals(1000, CoinOil.getPurchaseAmount());

    }
}