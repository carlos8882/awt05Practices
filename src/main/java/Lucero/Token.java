package Lucero;

public class Token {
    public String value;
    public KindToken kind;

    public Token(String value, KindToken kind) {
        this.value = value+1;
        this.kind = kind;
    }
}
