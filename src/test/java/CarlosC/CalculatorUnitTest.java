package CarlosC;

import org.junit.jupiter.api.Test;

import static CarlosC.Calculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorUnitTest {

    @Test
    public void sumTest(){
        //given
        int number1 = 4;
        int number2 = 2;
        //when
        int expected = number1 + number2;
        int actual = sum(number1, number2);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void resTest(){
        //given
        int number1 = 4;
        int number2 = 2;
        //when
        int expected = number1 - number2;
        int actual = res(number1, number2);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void multiTest(){
        //given
        int number1 = 4;
        int number2 = 2;
        //when
        int expected = number1 * number2;
        int actual = multi(number1, number2);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void divTest(){
        //given
        int number1 = 4;
        int number2 = 2;
        //when
        int expected = number1 / number2;
        int actual = div(number1, number2);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void divZeroTest(){
        //given
        int number1 = 4;
        int number2 = 0;
        //when
        int expected = 0;
        int actual = sum(number1, number2);
        //then
        assertEquals(expected, actual);
    }
}
