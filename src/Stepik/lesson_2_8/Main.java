package Stepik.lesson_2_8;

import Stepik.lesson_2_8.Entities.Books.BOOKTYPES;
import Stepik.lesson_2_8.Entities.Books.Book;
import Stepik.lesson_2_8.Entities.Books.GENRE;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Джоан Роулинг","Гарри Поттер и философский камень", new GENRE[]{GENRE.Novel,GENRE.SciFi},1997, BOOKTYPES.Book);
        System.out.println(book);
    }
}
