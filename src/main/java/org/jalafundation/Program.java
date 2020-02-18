package org.jalafundation;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;

        boolean running = true;

        while (running){
            System.out.println("Select an operation:\n\t1) Sum \n\t2) Rest \n\t3) Multiply \n\t4) Div \n\t0) Quit");
            System.out.print(": ");
            selection = input.nextInt();

            if (selection == 0) {
                break;
            }

            System.out.println("Insert Numbers");
            int number1 = AskNumber(input);
            int number2 = AskNumber(input);

            switch (selection) {
                case 1:
                    System.out.println("R: " + Calculator.Sum(number1, number2));
                    break;
                case 2:
                    System.out.println("R: " + Calculator.Rest(number1, number2));
                    break;
                case 3:
                    System.out.println("R: " + Calculator.Multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("R: " + Calculator.Div(number1, number2));
                    break;
                default:
                    System.out.println("Undefined command.");
                    break;
            }
        }
    }

    private static int AskNumber(Scanner input) {
        System.out.print(": ");
        return input.nextInt();
    }
}
