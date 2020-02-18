package org.jalafundation;

public class Calculator {
    public static int Sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int Rest(int number1, int number2) {
        return number1 - number2;
    }

    public static int Multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int Div(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Not supported div of 0");
        }
        return number1 / number2;
    }
}
