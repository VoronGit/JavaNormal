package Stepik.lesson_3_10;

import java.sql.SQLException;

public class DB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Conn.Conn();
        Conn.CreateDB();
        Conn.insert_type("Абиссинская кошка");
        Conn.insert_type("Австралийский мист");
        Conn.insert_type("Американская жесткошерстная");
        Conn.add_all_types();
        Conn.delete_type(2);
        Conn.delete_type(44);
        Conn.update_type(3,"Супер кошка");
        Conn.update_type(56,"Кошка-пример");
        System.out.println(Conn.get_type(3));
        System.out.println(Conn.get_type(34));
        System.out.println(Conn.get_type(56));
        Conn.get_type_where("id < 15");
        Conn.get_type_where("type LIKE '%а'");
        Conn.get_all_types();
        Conn.insert_cat("Bob", "Наполеон", 7, 5.67);
        Conn.insert_cat("Mark", "Сноу-шу", 6, 3.43);
        Conn.insert_cat("Sam", "Экзотический", 4, 4.92);
        Conn.add_more_cats(20);
        Conn.delete_cat(2);
        Conn.delete_cat("id > 15");
        Conn.update_cat("name = 'Котяра'","id = 1");
        Conn.get_cat(4);
        Conn.get_cat(8);
        Conn.get_cat_where("id > 7");
        Conn.get_all_cats();
        Conn.CloseDB();
    }
}
