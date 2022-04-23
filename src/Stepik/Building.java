package Stepik;

interface LivingHouse {
    void settleDown();
    void clean();
    void getDirty();
}

interface SocialHouse {

    void clean();
    void getDirty();
}

abstract public class Building {
    String name;
    String address;
    int year;
    String architectName;
    boolean isCulture;
}

class Library extends Building implements SocialHouse {
    private String name;
    private String address;
    private int year;
    private String architectName;
    private boolean isCulture;
    private boolean isClean;

    private int books;
    private int booksRead;

    public void read() {
        getDirty();
        if (booksRead < books) {
            booksRead++;
            System.out.println("Вы прочитали книгу! Всего прочитано " + booksRead + " из " + books + "книг в библиотеке \"" + name + "\" .");
        } else {
            System.out.println("Больше читать нечего! Всего прочитано " + booksRead + " из " + books + "книг в библиотеке \"" + name + "\" .");
        }
    }

    @Override
    public void clean() {
        isClean = true;
    }

    @Override
    public void getDirty() {
        isClean = false;
    }

    public void getBooks(int n) {
        books -= n;
    }

    public void addBooks(int n) {
        books += n;
    }

    @Override
    public String toString() {
        return "Библиотека \"" + name + "\" находится по адресу: " + address + "." + "\n" +
                "Построена в " + year + " году, под руководством архитектора " + architectName + "." + "\n" +
                "Вы прочитали " + booksRead + " из " + books + "книг в библиотеке." + "\n" +
                (isCulture ? "Признана культурной памяткой." : "Культурной памяткой не является.");
    }
}

class House extends Building implements LivingHouse {
    private String name;
    private String address;
    private int year;
    private String architectName;
    private boolean isCulture;
    private boolean isClean;

    private int area;
    private int people;
    final private int peopleMax = (int) (area / 1.5);

    @Override
    public void clean() {
        isClean = true;
    }

    @Override
    public void getDirty() {
        isClean = false;
    }

    public void settleDown() {
        getDirty();
        if (people < peopleMax) {
            people++;
            System.out.println("Вы поселились! Занято жилых мест в доме по адресу " + address + ": " + people + " из " + peopleMax + ".");
        } else {
            System.out.println("Селится некуда! Занято жилых мест в доме по адресу " + address + ": " + people + " из " + peopleMax + ".");
        }
    }

    @Override
    public String toString() {
        return "Дом \"" + name + "\" находится по адресу: " + address + "." + "\n" +
                "Построен в " + year + " году, под руководством архитектора " + architectName + "." + "\n" +
                "Занято жилых мест в доме: " + people + " из " + peopleMax + "." + "\n" +
                (isCulture ? "Признан культурной памяткой." : "Культурной памяткой не является.");
    }
}