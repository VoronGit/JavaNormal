package Stepik.lesson_3_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conn {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:./src/Stepik/lesson_3_10/My_cats.db");

        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
    public static void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
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

    // --------Заполнение таблицы--------
    public static void insert_type(String type) throws SQLException {
        String exp = "INSERT INTO 'types' ('type') VALUES ('" + type + "');";
        statmt.execute(exp);

        System.out.println("Таблица заполнена");
    }
    public static void add_all_types() throws SQLException {
        String[] types = new String[]{
                "Американская короткошерстная",
                "Американский бобтейл",
                "Американский кёрл",
                "Балинезийская кошка",
                "Бенгальская кошка",
                "Бирманская кошка",
                "Бомбейская кошка",
                "Бразильская короткошёрстная",
                "Британская длинношерстная",
                "Британская короткошерстная",
                "Бурманская кошка",
                "Бурмилла кошка",
                "Гавана",
                "Гималайская кошка",
                "Девон-рекс",
                "Донской сфинкс",
                "Европейская короткошерстная",
                "Египетская мау",
                "Канадский сфинкс",
                "Кимрик",
                "Корат",
                "Корниш-рекс",
                "Курильский бобтейл",
                "Лаперм",
                "Манчкин",
                "Мейн-ку́н",
                "Меконгский бобтейл",
                "Мэнкс кошка",
                "Наполеон",
                "Немецкий рекс",
                "Нибелунг",
                "Норвежская лесная кошка",
                "Ориентальная кошка",
                "Оцикет",
                "Персидская кошка",
                "Петерболд",
                "Пиксибоб",
                "Рагамаффин",
                "Русская голубая кошка",
                "Рэгдолл",
                "Саванна",
                "Селкирк-рекс",
                "Сиамская кошка",
                "Сибирская кошка",
                "Сингапурская кошка",
                "Скоттиш-фолд",
                "Сноу-шу",
                "Сомалийская кошка",
                "Тайская кошка",
                "Тойгер",
                "Тонкинская кошка",
                "Турецкая ангорская кошка",
                "Турецкий ван",
                "Украинский левкой",
                "Чаузи",
                "Шартрез",
                "Экзотическая короткошерстная",
                "Японский бобтейл"
        };
        for (String str : types) {
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
    public static void get_type(int id) throws SQLException {
        resSet = statmt.executeQuery("SELECT * FROM 'types' where id = " + id + ";");
        System.out.println(resSet.getString("type"));
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
    // --------Закрытие--------
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }

}