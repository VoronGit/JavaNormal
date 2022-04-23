package Book;

import java.util.Scanner;

public class Book{
    Title title = new Title();
    Author author = new Author();
    Content content = new Content();
    public static void main(String[] args) {

        Book book = new Book();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        book.title.setTitle(scan.nextLine());
        System.out.println("Введите автора книги: ");
        book.author.setAuthor(scan.nextLine());
        System.out.println("Введите содержание книги: ");
        book.content.setContent(scan.nextLine());
        System.out.println();
        System.out.println("Ваша книга:");
        book.title.show();
        book.author.show();
        book.content.show();
    }
}

class Title {

    String str = "";
    void setTitle(String str) {
        this.str = str;
    }
    void show() {
        System.out.println("Название книги: " + str);
    }
}

class Author {

    String str;
    void setAuthor(String str) {
        this.str = str;
    }
    void show() {
        System.out.println("Автор книги: " + str);
    }
}

class Content {

    String str;
    void setContent(String str) {
        this.str = str;
    }
    void show() {
        System.out.println("Содержание книги: " + str);
    }
}