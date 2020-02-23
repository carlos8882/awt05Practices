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

}
