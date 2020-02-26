package Lucero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Insert expresion to evaluate:");
            String text = input.nextLine();

            System.out.println("Result:");
            Parser parser = new Parser(text);
            ExpressionSyntax expression = parser.parse();
            Evaluator evaluator = new Evaluator();

            int result = evaluator.evaluate(expression);
            System.out.println(result);
    }
}
