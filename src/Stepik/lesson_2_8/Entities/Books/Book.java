package Stepik.lesson_2_8.Entities.Books;

public class Book implements Stepik.lesson_2_8.Interface.Book {
    private final String author;
    private final String name;
    private final GENRE[] genres;
    private final int year;
    private final BOOKTYPES type;

    public Book(String author, String name, GENRE[] genres, int year, BOOKTYPES type) {
        this.author = author;
        this.name = name;
        this.genres = genres;
        this.year = year;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        StringBuilder genreString = new StringBuilder();
        for (GENRE genre : genres) {
            genreString.append(genre.toString());
            genreString.append(", ");
        }
        return genreString.substring(0,genreString.length()-2);
    }

    public int getYear() {
        return year;
    }

    public BOOKTYPES getType() {
        return type;
    }

    public String toString() {
        return type.toString() + ": " + name + ", " + year + ", " + author + ". \nЖанр: " + getGenre() + ".";
    }
}
