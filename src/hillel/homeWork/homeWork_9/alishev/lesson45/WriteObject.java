package hillel.homeWork.homeWork_9.alishev.lesson45;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(12,"Sergei");
        Person person2 = new Person(46,"Maks");

        try {
            FileOutputStream fileWriter = new FileOutputStream("src/hillel/homeWork/homeWork_9/alishev/lesson45/people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
