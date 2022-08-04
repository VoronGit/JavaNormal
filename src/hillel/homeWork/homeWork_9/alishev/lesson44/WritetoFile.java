package hillel.homeWork.homeWork_9.alishev.lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritetoFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/hillel/homeWork/homeWork_9/alishev/lesson44/testFile.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Row 1");
        pw.println("Row 2");

        pw.close();
    }
}
