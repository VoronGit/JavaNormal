package hillel.homeWork.homeWork_9.alishev.lesson45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/hillel/homeWork/homeWork_9/alishev/lesson45/people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
