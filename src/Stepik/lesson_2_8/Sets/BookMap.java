package Stepik.lesson_2_8.Sets;

import Stepik.lesson_2_8.Entities.Books.Book;

import java.util.HashMap;

public class BookMap extends HashMap<Book, Integer> {

    public void addBook(Book book){
        if (super.containsKey(book)) {
            super.replace(book, super.get(book) + 1);
        } else {
            super.put(book,1);
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
}