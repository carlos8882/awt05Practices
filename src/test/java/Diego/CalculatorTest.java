package Diego;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addTwoNumbers(){
        //given
        double number1 = 4, number2 = 7;
        //when
        double result = Calculator.addition(number1,number2);
        //then
        assertEquals(result, 11.0);
    }
    public void substractTwoNumbers(){
        //given
        double number1 = 7, number2 = 2;
        //when
        double result = Calculator.subtraction(number1,number2);
        //then
        assertEquals(result, 5.0);
    }
    @Test
    public void multTwoNumbers(){
        //given
        double number1 = 4, number2 = 7;
        //when
        double result = Calculator.multiplication(number1,number2);
        //then
        assertEquals(result, 28.0);
    }
    @Test
    public void divideTwoNumbers(){
        //given
        double number1 = 7, number2 = 2;
        //when
        double result = Calculator.division(number1,number2);
        //then
        assertEquals(result, 3.5);
    }
}
