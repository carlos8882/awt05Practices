package Carlos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
    @Test
    public void givenTwoNumbersWhenSumThenResult() {
        // given
        int firstValue = 15;
        int secondValue = 24;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.sum();

        // then
        assertEquals(result, "The sum total is: 39.0");
    }
    @Test
    public void givenTwoNumbersWhenSubtractionThenResult() {
        // given
        int firstValue = 23;
        int secondValue = 8;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.subtraction();

        // then
        assertEquals(result, "The subtraction total is: 15.0");
    }
    @Test
    public void givenTwoNumbersWhenMultiplicationThenResult() {
        // given
        int firstValue = 15;
        int secondValue = 3;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.multiplication();

        // then
        assertEquals(result, "The multiplication total is: 45.0");
    }
    @Test
    public void givenTwoNumbersWhenDivisionThenResult() {
        // given
        int firstValue = 60;
        int secondValue = 4;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.division();

        // then
        assertEquals(result, "The division total is: 15.0");
    }
    @Test
    public void givenTwoNumbersWhenPowerThenResult() {
        // given
        int firstValue = 4;
        int secondValue = 3;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.power();

        // then
        assertEquals(result, "The power result is: 64.0");
    }
    @Test
    public void givenTwoNumbersWhenRootThenResult() {
        // given
        int firstValue = 625;
        int secondValue = 4;
        ArithmeticOperations operation = new ArithmeticOperations(firstValue,secondValue);

        // when
        String result = operation.root();

        // then
        assertEquals(result, "The root result is: 5.0");
    }

}
