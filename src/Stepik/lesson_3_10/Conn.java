package Stepik.lesson_3_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conn {
    public static Connection conn;
    public static Statement statmt;
    public static Statement statmt2;
    public static ResultSet resSet;
    public static ResultSet resSet2;
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:./src/Stepik/lesson_3_10/My_cats.db");

        System.out.println("База Подключена!");
    }
    public static void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt2 = conn.createStatement();
        Class.forName("org.sqlite.JDBC");
        statmt.execute("DROP TABLE if exists 'types';");
        statmt.execute("CREATE TABLE if not exists 'types' ('id' INTEGER unique PRIMARY KEY AUTOINCREMENT , 'type' VARCHAR (100) not null);");
        statmt.execute("DELETE FROM 'types'");
        statmt.execute("DROP TABLE if exists 'cats';");
        statmt.execute("CREATE TABLE if not exists 'cats' ('id' INTEGER unique PRIMARY KEY AUTOINCREMENT " +
                                                            ", 'name' VARCHAR (20) not null" +
                                                            ", 'type_id' INTEGER not null REFERENCES types (id) ON DELETE CASCADE ON UPDATE CASCADE MATCH SIMPLE" +
                                                            ", 'age' INTEGER not null" +
                                                            ", 'weight' DOUBLE);");
        statmt.execute("DELETE FROM 'cats'");
        System.out.println("Таблица создана или уже существует.");
    }
    public static void insert_type(String type) throws SQLException {
        String exp = "INSERT INTO 'types' ('type') VALUES ('" + type + "');";
        statmt.execute(exp);

        System.out.println("Таблица заполнена");
    }
    public static void add_all_types() throws SQLException {

        for (String str : CatTypes.types) {
            String exp = "INSERT INTO 'types' ('type') VALUES ('" + str + "');";
            statmt.execute(exp);
        }
        System.out.println("Таблица заполнена");
    }
    public static void delete_type(int id) throws SQLException {
        statmt.execute("delete from 'types' where id = " + id + ";");
        System.out.println("Удаление завершено!");
    }
    public static void update_type(int id, String new_type) throws SQLException {
        statmt.execute("update 'types' set 'type' = '" + new_type + "' where id = " + id + ";");
        System.out.println("Изменения внесены!");
    }
    public static String get_type(int id) throws SQLException {
        resSet = statmt.executeQuery("SELECT * FROM 'types' where id = " + id + ";");
        return resSet.getString("type");
    }
    public static void get_type_where(String where) throws SQLException {
        resSet = statmt.executeQuery("SELECT * FROM 'types' where " + where + ";");
        while (resSet.next()) {
            System.out.println(resSet.getString("type"));
        }
    }
    public static void get_all_types() throws SQLException {
        resSet = statmt.executeQuery("SELECT * FROM 'types';");
        while (resSet.next()) {
            System.out.println(resSet.getString("type"));
        }
    }
    public static void insert_cat(String name, String type, int age, Double weight) throws SQLException {
        int type_id = 0;
        resSet = statmt.executeQuery("SELECT id FROM 'types' where type in ('" + type + "');");
        if (resSet.next()) {
            type_id = resSet.getInt("id");
        } else {
            statmt.execute("INSERT INTO 'types' ('type') VALUES ('" + type + "');");
            resSet = statmt.executeQuery("SELECT id FROM 'types' where type in ('" + type + "');");
            type_id = resSet.getInt("id");
        }
        statmt.execute("INSERT INTO 'cats' ('name','type_id','age','weight') VALUES ('" + name + "'," + type_id + "," + age + "," + weight + ");");
        System.out.println("Добавили котика");
    }

    public static void add_more_cats(int n) throws SQLException {
        for (int i = 0; i < n; i++){
            insert_cat(CatNames.names[(int) (Math.random() * CatNames.names.length)], CatTypes.types[(int) (Math.random() * CatTypes.types.length)]
                    , (int) (Math.random() * 10), Math.random() * 10);
        }
    }
    public static void delete_cat(int id) throws SQLException {
        statmt.execute("delete from 'cats' where id = " + id + ";");
        System.out.println("Удаление завершено!");
    }
    public static void delete_cat(String where) throws SQLException {
        statmt.execute("delete from 'cats' where " + where + ";");
        System.out.println("Удаление завершено!");
    }
    public static void update_cat(String set, String where) throws SQLException{
        statmt.execute("update 'cats' set " + set + " where " + where + ";");
        System.out.println("Изменения внесены!");
    }
    public static void get_cat(int id) throws SQLException{
        resSet2 = statmt2.executeQuery("SELECT * FROM 'cats' where id = " + id + ";");
        while (resSet2.next()) {
            System.out.println("Выбранн кот ИД: " + resSet2.getInt("id") + ",\n" +
                    "Имя: " + resSet2.getString("name") + ",\n" +
                    "Порода: " + get_type(resSet2.getInt("type_id")) + ",\n" +
                    "Возраст: " + resSet2.getInt("age") + ",\n" +
                    "Вес: " + resSet2.getDouble("weight") + "."
            );
        }
    }
    public static void get_cat_where(String where) throws SQLException{
        resSet2 = statmt2.executeQuery("SELECT * FROM 'cats' where " + where + ";");
        while (resSet2.next()) {
            System.out.println("Выбранн кот ИД: " + resSet2.getInt("id") + ",\n" +
                    "Имя: " + resSet2.getString("name") + ",\n" +
                    "Порода: " + get_type(resSet2.getInt("type_id")) + ",\n" +
                    "Возраст: " + resSet2.getInt("age") + ",\n" +
                    "Вес: " + resSet2.getDouble("weight") + "."
            );
        }
    }
    public static void get_all_cats() throws SQLException{
        resSet2 = statmt2.executeQuery("SELECT * FROM 'cats';");
        while (resSet2.next()) {
            System.out.println("Выбранн кот ИД: " + resSet2.getInt("id") + ",\n" +
                    "Имя: " + resSet2.getString("name") + ",\n" +
                    "Порода: " + get_type(resSet2.getInt("type_id")) + ",\n" +
                    "Возраст: " + resSet2.getInt("age") + ",\n" +
                    "Вес: " + resSet2.getDouble("weight") + "."
            );
        }
    }
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        statmt2.close();
        resSet.close();
        resSet2.close();

        System.out.println("Соединения закрыты");
    }

}