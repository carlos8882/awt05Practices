package Lucero;

public class Evaluator {

    public int evaluate(ExpressionSyntax expression) {
        if (expression.getKind() == SyntaxKind.NUMBER_EXPRESSION) {
            return Integer.parseInt(((NumberExpression) expression).getNumber().value);
        }

        if (expression.getKind() == SyntaxKind.BINARY_EXPRESSION) {
            BinaryExpression binary = (BinaryExpression)expression;
            int left = evaluate(binary.getLeft());
            int right = evaluate(binary.getRight());

            switch (binary.getOperator().kind)
            {
                case ADDITION_TOKEN:
                    return left + right;
                case SUBTRACTION_TOKEN:
                    return left - right;
                case MULTIPLICATION_TOKEN:
                    return left * right;
                case DIVISION_TOKEN:
                    return left / right;
                default:
                    throw new ArithmeticException("Unexpected binary operator <"
                                                  + binary.getOperator().kind + ">");
            }
        }

        throw new IllegalStateException("Unexpected node <" + expression.getKind() + ">");
    }
}
