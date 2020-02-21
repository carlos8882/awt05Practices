package Carlos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionesTest {
    @Test
    public void givenTwoNumbersWhenSumThenResult() {
        // given
        int firstValue = 3;
        int secondValue = 3;
        Operaciones operaciones = new Operaciones(firstValue,secondValue);

        // when
        String result = operaciones.sumar();

        // then
        assertEquals(result, "el resultado de la suma es: 6.0");
    }
    @Test
    public void givenTwoNumbersWhenRestThenResult() {
        // given
        int firstValue = 12;
        int secondValue = 3;
        Operaciones operaciones = new Operaciones(firstValue,secondValue);

        // when
        String result = operaciones.restar();

        // then
        assertEquals(result, "el resultado de la resta es: 9.0");
    }
}
