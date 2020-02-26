package Lucero;

public class Token {
    public String value;
    public SyntaxKind kind;

    public Token(String value, SyntaxKind kind) {
        this.value = value;
        this.kind = kind;
    }
}
