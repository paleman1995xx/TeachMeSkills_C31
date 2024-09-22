package calculator;

public enum Operation {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVISION('/'),
    MOD('%');

    private final char operChar;

    Operation(char operChar){
        this.operChar = operChar;
    }

    public char getOperChar() {
        return operChar;
    }
}
