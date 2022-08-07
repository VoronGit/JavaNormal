package hillel.homeWork.homeWork_10.alishev.lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(12,"Sergei"),new Person(46,"Maks"),new Person(3,"Tom")};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/hillel/homeWork/homeWork_10/alishev/lesson47/people.bin"))){
            objectOutputStream.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
