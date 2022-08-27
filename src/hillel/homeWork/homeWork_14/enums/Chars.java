package hillel.homeWork.homeWork_14.enums;

public enum Chars {
    OPEN_BRACKET('('),
    CLOSE_BRACKET(')'),
    NUMBER_BOTTOM_LIMIT('0'),
    NUMBER_TOP_LIMIT('9');

    private char value;

    Chars(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
