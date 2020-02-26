package Lucero;

public class Lexer {
    private String text;
    private int position;

    public Lexer(String text) {

        this.text = text;
    }

    private char getCurrent() {
        if (position >= text.length()) {
            return '\u0000';
        }
        return text.charAt(position);
    }

    private void nextPosition() {
        position++;
    }

    public Token nextToken() {
        if (position == text.length()) {
            return new Token("\n0000", SyntaxKind.END_TOKEN);
        }

        if (Character.isDigit(getCurrent())) {
            int start = position;
            while (Character.isDigit(getCurrent())) {
                nextPosition();
            }
            String number = text.substring(start, position);
            return new Token(number, SyntaxKind.NUMBER_TOKEN);
        }

        if (Character.isWhitespace(getCurrent())) {
            int start = position;
            nextPosition();
            String whiteSpaces = text.substring(start, position);
            return new Token(whiteSpaces, SyntaxKind.WHITESPACE_TOKEN);
        }

        switch (getCurrent()) {
            case '+':
                nextPosition();
                return new Token("+", SyntaxKind.ADDITION_TOKEN);
            case '-':
                nextPosition();
                return new Token("-", SyntaxKind.SUBTRACTION_TOKEN);
            case '*':
                nextPosition();
                return new Token("*", SyntaxKind.MULTIPLICATION_TOKEN);
            case '/':
                nextPosition();
                return new Token("/", SyntaxKind.DIVISION_TOKEN);
            default:
                return new Token("Invalid", SyntaxKind.INVALID_TOKEN);
        }
    }
}
