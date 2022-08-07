package hillel.homeWork.homeWork_10.alishev.lesson47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/hillel/homeWork/homeWork_10/alishev/lesson47/people.bin"))){
            Person[] people = (Person[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
