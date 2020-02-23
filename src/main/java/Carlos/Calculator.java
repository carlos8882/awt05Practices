package Carlos;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String term, operator;
        double firsTerm;
        double secondTerm;
        System.out.println("Please enter your operation ");
        term = scanner.nextLine();

        for (int i = 0; i < term.length(); i++) {
            if ("/*-+pr".contains(term.charAt(i) + "")) {//I use charAt for search a char that contains any operation symbol
                firsTerm = Double.parseDouble(term.substring(0, i));
                operator = term.substring(i, i + 1);
                if (term.substring(i + 1).length() != 0) {
                    secondTerm = Double.parseDouble(term.substring(i + 1));
                } else {
                    System.out.println("Wrong operation");
                    break;
                }
                ArithmeticOperations operation = new Carlos.ArithmeticOperations(firsTerm, secondTerm);
                switch (operator) {
                    case "+":
                        System.out.println(operation.sum());
                        break;
                    case "-":
                        System.out.println(operation.subtraction());
                        break;
                    case "*":
                        System.out.println(operation.multiplication());
                        break;
                    case "/":
                        System.out.println(operation.division());
                        break;
                    case "p":
                        System.out.println(operation.power());
                        break;
                    case "r":
                        System.out.println(operation.root());
                        break;
                    default:
                        System.out.println("Wrong operation data");
                }
            }
        }
    }
}
