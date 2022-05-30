package Stepik.lesson_2_8.Entities.Books;

public enum BOOKTYPES {
    Journal ("Журнал"),
    Book ("Книга");

    private final String type;

    BOOKTYPES(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
