package Lucero;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvaluatorTest {

    private static Evaluator evaluator;

    @BeforeAll
    public static void initAll() {
        evaluator = new Evaluator();
    }

    @ParameterizedTest
    @CsvSource({
            "3      *1,         3",
            "2 / 2,             1",
            "  1  + 2  ,        3",
            "8-2*2+8+2*2,      16",
            "15 - 5 - 2 - 1,    7",
            "0 - 1,             -1",
            " 0 / 458960,       0",
    })
    public void evaluate_Arithmetic_Operation_Test(String text, int result) {
        Parser parser = new Parser(text);
        ExpressionSyntax root = parser.parse();

        assertEquals(result, evaluator.evaluate(root));
    }

    @Test
    public void evaluate_ArithmeticException_When_DivideBy_Zero_Test() {
        Parser parser = new Parser("25/0");
        ExpressionSyntax root = parser.parse();

        assertThrows(ArithmeticException.class, () -> evaluator.evaluate(root));
    }

    @ParameterizedTest
    @CsvSource({
            "2**1",
            "1++1",
            "1--1",
            "1//1",
            "1/-1",
            " 2 - * 1",
    })
    public void evaluate_IllegalArgumentException_When_Expression_IsBad_Test(String text) {
        Parser parser = new Parser(text);

        assertThrows(IllegalArgumentException.class, parser::parse);
    }
}
