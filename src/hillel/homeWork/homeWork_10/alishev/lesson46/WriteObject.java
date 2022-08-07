package hillel.homeWork.homeWork_10.alishev.lesson46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(12,"Sergei"),new Person(46,"Maks"),new Person(3,"Tom")};

        try {
            FileOutputStream fileWriter = new FileOutputStream("src/hillel/homeWork/homeWork_10/alishev/lesson46/people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter);

            //objectOutputStream.writeInt(people.length);

            //for (Person person : people) {
            //    objectOutputStream.writeObject(person);
            //}

            objectOutputStream.writeObject(people);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
