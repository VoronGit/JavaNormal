package hillel.homeWork.homeWork_10.alishev.lesson46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/hillel/homeWork/homeWork_10/alishev/lesson46/people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //int personInt = objectInputStream.readInt();
            //Person[] people = new Person[personInt];

            //for (int i = 0; i < personInt; i++) {
            //    people[i] = (Person) objectInputStream.readObject();
            //}

            Person[] people = (Person[]) objectInputStream.readObject();

            System.out.println(Arrays.toString(people));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
