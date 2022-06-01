package Stepik.lesson_2_8;

import Stepik.lesson_2_8.Entities.Books.BOOKTYPES;
import Stepik.lesson_2_8.Entities.Books.Book;
import Stepik.lesson_2_8.Entities.Books.GENRE;
import Stepik.lesson_2_8.Entities.Clients.Client;
import Stepik.lesson_2_8.Entities.Employee.Employee;
import Stepik.lesson_2_8.Entities.Employee.POSITION;
import Stepik.lesson_2_8.MainCore.ClientDialog;
import Stepik.lesson_2_8.Sets.BookMap;
import Stepik.lesson_2_8.Sets.ClientsSet;
import Stepik.lesson_2_8.Sets.EmployeeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Book book = new Book("Джоан Роулинг","Гарри Поттер и философский камень", new GENRE[]{GENRE.Novel,GENRE.SciFi},1997, BOOKTYPES.Book);
        Book book2 = new Book("Стивен Кинг","Оно", new GENRE[]{GENRE.Novel,GENRE.SciFi},1986, BOOKTYPES.Book);
        BookMap books = new BookMap();
        books.addBook(book);
        books.addBook(book);
        books.addBook(book2);
        books.addBook(book2,4);
        System.out.println(book);
        System.out.println(books.getBookList());
        books.removeBook(book);
        System.out.println(books.getBookList());
        System.out.println(books.getBookByNumber(2));

        Employee employee = new Employee("Иванович", "Иван","Иванов", POSITION.Guard);
        Employee employee2 = new Employee("Петровна", "Лидия","Петрова", POSITION.Janitor);
        Employee employee3 = new Employee("Никитишна", "Мария","Загребельская", POSITION.Librarian);

        EmployeeSet employees = new EmployeeSet();
        employees.addEmployee(employee);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);

        System.out.println(employees.getEmployeeList());
        System.out.println(employees.getEmployeeByNumber(2));

        Client client = new Client("Петрович","Петр","Петров");
        Client client2 = new Client("Никитович","Ибрагим","Волевой");
        Client client3 = new Client("Игоревич","Даниил","Городовой");
        client.addBook(book);
        client.addBook(book2);
        client2.addBook(book);
        client3.addBook(book2);

        ClientsSet clients = new ClientsSet();
        clients.addClient(client);
        clients.addClient(client2);
        clients.addClient(client3);

        System.out.println(clients.getClientList());
        System.out.println(clients.getClientByNumber(3));
        ClientDialog clientDialog = new ClientDialog();
        System.out.println(clientDialog.getMenuNumber("Выберите пункт меню: "));
    }
}
