package mobilFillingStation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MobilFillingStationDiscountTest {

    private String MobilFillingStationDiscount;

    @Test
    public static void main(String[] args) {
        MobilFillingStationDiscount station = new MobilFillingStationDiscount("Mobil", 2);
        int percentage = station.percentage();
        Assertions.assertEquals((percentage),100);
    }
}