package Carlos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionesTest {
    @Test
    public void operationTestSum() {
        // given
        Operaciones operaciones = new Operaciones(3,3);

        // when
        String result = operaciones.sumar();

        // then
        assertEquals(result, "el resultado de la suma es: 6.0");
    }
}
