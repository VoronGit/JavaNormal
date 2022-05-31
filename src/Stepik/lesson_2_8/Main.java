package Stepik.lesson_2_8;

import Stepik.lesson_2_8.Entities.Books.BOOKTYPES;
import Stepik.lesson_2_8.Entities.Books.Book;
import Stepik.lesson_2_8.Entities.Books.GENRE;
import Stepik.lesson_2_8.Sets.BookMap;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Джоан Роулинг","Гарри Поттер и философский камень", new GENRE[]{GENRE.Novel,GENRE.SciFi},1997, BOOKTYPES.Book);
        Book book2 = new Book("Джоан Роулинг","Гарри Поттер и философский камень", new GENRE[]{GENRE.Novel,GENRE.SciFi},1997, BOOKTYPES.Book);
        BookMap books = new BookMap();
        books.addBook(book);
        books.addBook(book);
        System.out.println(book);
        System.out.println(books.getBookList());
        books.removeBook(book);
        System.out.println(books.getBookList());
    }
}
