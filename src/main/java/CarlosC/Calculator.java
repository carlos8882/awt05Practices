package CarlosC;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an operation");

        String expresion = input.nextLine();
        expresion = expresion.replace(" ","");
        String operators = "+-*/";

        int result = 0;
        for (char operator: operators.toCharArray()
             ) {
                String stringOperator=  String.valueOf(operator);
                if (expresion.contains(stringOperator)) {
                    result = getResult(stringOperator, expresion);
                    break;
            }
        }

        System.out.println(result);
    }

    public static int getResult(String operator, String expresion){
        int result = 0;
        String[] values = new String[]{};
        switch (operator){
            case ("+"):
                values = expresion.split("\\+");
                result = sum(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
                break;
            case ("-"):
                values = expresion.split("-");
                result = res(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
                break;
            case ("*"):
                values = expresion.split("\\*");
                result = multi(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
                break;
            case ("/"):
                values = expresion.split("/");
                result = div(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
                break;
        }
        return result;
    }


    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static int res(int number1, int number2){
        return number1 - number2;
    }

    public static int multi(int number1, int number2){
        return number1 * number2;
    }

    public static int div(int number1, int number2){
        return number1 / number2;
    }


}
