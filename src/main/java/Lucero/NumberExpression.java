package Lucero;

public class NumberExpression implements ExpressionSyntax {

    private Token number;

    public NumberExpression(Token number) {

        this.number = number;
    }

    public Token getNumber() {
        return number;
    }

    @Override
    public SyntaxKind getKind() {
        return SyntaxKind.NUMBER_EXPRESSION;
    }
}
