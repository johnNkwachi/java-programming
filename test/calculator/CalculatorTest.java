package calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void initialSetUp() {
        calculator = new Calculator();
    }

    @Test
    public void test_addTwoNumbers() {
        int result = calculator.addTwoNumbers(12, 4);
        Assertions.assertEquals(result, 16);
    }

    @Test
    public void test_multiplyTwoNumbers() {
        int result = calculator.multiplyTwoNumbers(3, 3);
        Assertions.assertEquals(result, 9);

    }

    @Test
    public void test_divideTwoNumbers() {
        int result = calculator.divideTwoNumbers(3, 3);
        Assertions.assertEquals(result, 1);

    }

    @Test
    public void test_subtractTwoNumbers(){
        int result = calculator.subtractTwoNumbers(5,2);
        Assertions.assertEquals(result, 3);
    }
}