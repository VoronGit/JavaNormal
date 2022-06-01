package Stepik.lesson_2_8.Interface;

import Stepik.lesson_2_8.Entities.Books.BOOKTYPES;

public interface Book {
    String getAuthor();
    String getName();
    String getGenre();
    int getYear();
    BOOKTYPES getType();
    String toString();
}
