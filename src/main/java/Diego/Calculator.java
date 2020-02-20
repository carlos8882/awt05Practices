package Diego;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] dhpp) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la operacion a realizar:");
        String operation = "";
        double[] operands = new double[2];
        String operators = "";
        double result = 0;

        operation = input.next();
        for (int i = 0; i < operation.length(); i++) {
            if ("+-*/".contains(operation.charAt(i) + "")) {
                operands[0] = operation.substring(0, i).length() != 0 ? Double.parseDouble(operation.substring(0, i)) : 0;
                operands[1] = operation.substring(i+1).length()!=0 ? Double.parseDouble(operation.substring(i+1)) : 0;
                operators = operation.charAt(i) + "";
                break;
            }
        }

        switch (operators){
            case "+":
                result= addition(operands[1],operands[0]);
                break;
            case "-":
                result= subtraction(operands[1],operands[0]);
                break;
            case "*":
                result= multiplication(operands[1],operands[0]);
                break;
            case "/":
                result= division(operands[1],operands[0]);
                break;
        }

        System.out.print(operation+"="+result);
    }



    public static double addition(double a, double b)
    {
        double r;
        r = a+b;
        return(r);
    }

    public static double subtraction(double a, double b)
    {
        double r;
        r = a-b;
        return(r);
    }
    public static double multiplication(double a, double b)
    {
        double r;
        r = a*b;
        return(r);
    }

    public static double division(double a, double b)
    {
        double r;
        r = a/b;
        return(r);
    }
}

