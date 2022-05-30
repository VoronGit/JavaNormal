package Stepik.lesson_2_8.Entities.Books;

public enum GENRE {
    Detective ("Детектив"),
    Novel ("Роман"),
    SciFi ("Фентези")
    ;

    private final String genre;

    GENRE(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}