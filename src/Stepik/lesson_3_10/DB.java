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
        Conn.get_type(3);
        Conn.get_type(34);
        Conn.get_type(56);
        Conn.get_type_where("id < 15");
        Conn.get_type_where("type LIKE '%а'");
        Conn.get_all_types();
        Conn.CloseDB();
    }
}
