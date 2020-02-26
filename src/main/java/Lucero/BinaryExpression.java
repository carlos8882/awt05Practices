package Lucero;

public class BinaryExpression implements ExpressionSyntax {

    private ExpressionSyntax left;
    private Token operator;
    private ExpressionSyntax right;

    public BinaryExpression(ExpressionSyntax left, Token operator, ExpressionSyntax right) {

        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ExpressionSyntax getLeft() {
        return left;
    }

    public Token getOperator() {
        return operator;
    }

    public ExpressionSyntax getRight() {
        return right;
    }

    @Override
    public SyntaxKind getKind() {
        return SyntaxKind.BINARY_EXPRESSION;
    }
}

