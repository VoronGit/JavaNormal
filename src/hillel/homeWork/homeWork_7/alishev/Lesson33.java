package hillel.homeWork.homeWork_7.alishev;

import hillel.homeWork.homeWork_7.alishev.lesson32.Animal;

import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {
        ///////////////// Java5 ///////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        ///////////////// С появлением дженериков ///////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String anamal2 = animals2.get(1);

        ///////////////// Java7 ///////////////
        List<String> animals3 = new ArrayList<>();
    }
}
