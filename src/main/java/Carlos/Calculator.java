package Carlos;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String term, op;
        double a, b;
        System.out.println("Please enter your operation ");

        term = scanner.nextLine();

        for (int i = 0; i < term.length(); i++) {
            if ("/*-+".contains(term.charAt(i) + "")) {
                a = Double.parseDouble(term.substring(0, i));
                op = term.substring(i, i + 1);
                if (term.substring(i + 1).length() != 0) {
                    b = Double.parseDouble(term.substring(i + 1));
                } else {
                    System.out.println("Wrong operation");
                    break;
                }
                Operaciones operaciones = new Operaciones(a, b);
                switch (op) {
                    case "+":
                        System.out.println(operaciones.sumar());
                        break;
                    case "-":
                        System.out.println(operaciones.restar());
                        break;
                    case "*":
                        System.out.println(operaciones.multiplicar());
                        break;
                    case "/":
                        System.out.println(operaciones.dividir());
                        break;
                    default:
                        System.out.println("Wrong operation data");
                }
            }
        }
    }
}
