package WeekendSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestNumberTest {
    
    @Test
    public void testTheLargestNumberInTheArray(){
        //given
        int[]numbers = {30, 20, 2, 17, 69, 22};
        //when
       int largest =  HighestNumber.findLargestNumber(numbers);
        //assert

        assertEquals(69,largest );
    }

    @Test
    void testThatArrayIsNotEmpty() {
        int[]numbers = {30, 20, 2, 17, 69, 22};
        //when
        int largest =  HighestNumber.findLargestNumber(numbers);
        assertNotNull(largest);
    }
    @Test
    public void testIf_A_ParticularNumberIsInTheArray(){
        //give
        int[]numbers = {30, 20, 2, 17, 69, 22};
        int target = 69;
        //when
        int number = HighestNumber.search(numbers, target);
        //assert
        assertEquals(target, number);
    }

    @Test
    public void returnEvenNumberInTheArray(){
        //give
        int[]numbers = {30, 20, 2, 17, 69, 22};
        String num = "30269";
        //when
        String word = HighestNumber.evenNumbers(numbers);

        //assert
        assertEquals(num, word);
    }

}