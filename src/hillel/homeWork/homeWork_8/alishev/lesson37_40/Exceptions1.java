package hillel.homeWork.homeWork_8.alishev.lesson37_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void readFile() throws FileNotFoundException {
        File file = new File("asd");

        Scanner scanner = new Scanner(file);
    }
}
