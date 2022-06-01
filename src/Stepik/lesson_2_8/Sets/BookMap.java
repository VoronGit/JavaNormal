package Stepik.lesson_2_8.Sets;

import Stepik.lesson_2_8.Entities.Books.Book;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class BookMap extends LinkedHashMap<Book, Integer> {

    public void addBook(Book book){
        if (super.containsKey(book)) {
            super.replace(book, super.get(book) + 1);
        } else {
            super.put(book,1);
        }
    }
    public void addBook(Book book,int number){
        if (super.containsKey(book)) {
            super.replace(book, super.get(book) + number);
        } else {
            super.put(book,number);
        }
    }

    public void removeBook(Book book){
        if (super.get(book) > 1) {
            super.replace(book, super.get(book) - 1);
        } else {
            super.remove(book);
        }
    }

    public String getBookList(){
        StringBuilder str = new StringBuilder();
        int bookNum = 1;
        if (super.size() == 0) return "";
        for (Book book : super.keySet()) {
            str.append(bookNum++);
            str.append(". ");
            str.append(book.toString());
            str.append(" Количество книг в библиотеке: ");
            str.append(super.get(book));
            if (bookNum<=super.size()) {
                str.append(";\n");
            } else {
                str.append(".");
            }
        }
        return str.toString();
    }

    public Book getBookByNumber(int number) throws Exception{
        if (number == 0 || number > super.size()) throw new Exception("No such book in the list");
        ArrayList<Book> books = new ArrayList<>(super.keySet());
        return books.get(number - 1);
    }
}