package Stepik.lesson_2_8.Entities.Clients;

import Stepik.lesson_2_8.Entities.Books.Book;

import java.util.HashSet;

public class Client implements Stepik.lesson_2_8.Interface.Client {
    private final String lastname;
    private final String firstname;
    private final String surname;
    private final HashSet<Book> books;

    public Client(String lastname, String firstname, String surname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.books = new HashSet<>();
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String getAllBooks() {
        StringBuilder str = new StringBuilder();
        int bookNum = 1;
        if (books.size() == 0) return "";
        for (Object book : books.toArray()) {
            str.append(bookNum++);
            str.append(". ");
            str.append(book.toString());
            if (bookNum <= books.size()) {
                str.append("\n");
            }
        }
        return str.toString();
    }

    public String toStringShort() {
        return "Клиент: " + surname + " " + firstname + " " + lastname;
    }
    public String toString() {
        return "Клиент: " + surname + " " + firstname + " " + lastname + ". \nКниги у клиента:\n" + getAllBooks();
    }

}
