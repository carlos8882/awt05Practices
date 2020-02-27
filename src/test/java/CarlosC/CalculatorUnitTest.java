package CarlosC;

import org.junit.jupiter.api.Test;

import static CarlosC.Calculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorUnitTest {

    @Test
    public void sumTest(){
        //given
        int number1 = 4;
        int numner2 = 2;

        assertEquals(number1 + numner2, sum(number1, numner2));
    }

    @Test
    public void resTest(){
        //given
        int number1 = 4;
        int numner2 = 2;

        assertEquals(number1 - numner2, res(number1, numner2));
    }

    @Test
    public void multiTest(){
        //given
        int number1 = 4;
        int numner2 = 2;

        assertEquals(number1 * numner2, multi(number1, numner2));
    }

    @Test
    public void divTest(){
        //given
        int number1 = 4;
        int numner2 = 2;

        assertEquals(number1 / numner2, div(number1, numner2));
    }

    @Test
    public void divZeroTest(){
        //given
        int number1 = 4;
        int numner2 = 0;

        assertEquals(0, div(number1, numner2));
    }
}
