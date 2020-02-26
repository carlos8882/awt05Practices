package Lucero;

import java.util.ArrayList;

public class Parser {

    private ArrayList<Token> tokens;
    private int position;

    public Parser(String text) {
        this.position = 0;
        this.tokens = new ArrayList<>();
        Lexer lexer = new Lexer(text);
        Token token;
        do {
            token = lexer.nextToken();
            if (token.kind != SyntaxKind.WHITESPACE_TOKEN
                    && token.kind != SyntaxKind.INVALID_TOKEN) {
                tokens.add(token);
            }
        } while (token.kind != SyntaxKind.END_TOKEN);
    }

    private Token peek() {
        int index = position;
        if (index >= tokens.size()) {
            return tokens.get(tokens.size() - 1);
        }
        return tokens.get(index);
    }

    private  Token getCurrent() {
        return  peek();
    }

    private Token nextToken() {
        Token current = getCurrent();
        position++;
        return current;
    }

    public ExpressionSyntax parse() {
        ExpressionSyntax left = parseExpression();
        while (getCurrent().kind == SyntaxKind.ADDITION_TOKEN ||
               getCurrent().kind == SyntaxKind.SUBTRACTION_TOKEN)  {
            Token operator = nextToken();
            ExpressionSyntax right = parseExpression();
            left = new BinaryExpression(left, operator, right);
        }

        return left;
    }

    public ExpressionSyntax parseExpression() {
        Token numberToken = matchToken();
        ExpressionSyntax left = new NumberExpression(numberToken);

        while (getCurrent().kind == SyntaxKind.MULTIPLICATION_TOKEN ||
               getCurrent().kind == SyntaxKind.DIVISION_TOKEN)  {
            Token operator = nextToken();
            ExpressionSyntax right = parseExpression();
            left = new BinaryExpression(left, operator, right);
        }

        return left;
    }

    private Token matchToken() {
        if (getCurrent().kind == SyntaxKind.NUMBER_TOKEN) {
            return nextToken();
        }

        throw new IllegalArgumentException(
                "ERROR: Unexpected token <" + getCurrent().kind
                + ">, expected <" + SyntaxKind.NUMBER_TOKEN +">");
    }


}
