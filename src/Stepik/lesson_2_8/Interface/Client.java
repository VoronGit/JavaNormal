package Stepik.lesson_2_8.Interface;

public interface Client {
    String getLastname();
    String getFirstname();
    String getSurname();
    void addBook(Stepik.lesson_2_8.Entities.Books.Book book);
    void removeBook(Stepik.lesson_2_8.Entities.Books.Book book);
    String getAllBooks();
    String toStringShort();
    String toString();
}
