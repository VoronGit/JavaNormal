package hillel.homeWork.homeWork_8.alishev.lesson37_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        //  Checked exception (Compile time exception) - исключение, возможность возникновения которого проверяется
        //компилятором и должна быть обработана в коде.

        File file = new File("dsfdasf");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //  Unchecked exception (Runtime exception) - исключение, которое не проверяется при компиляции и может вызвать
        //ошибку во времямя работы программы, но обязательная обработка отсутсвует.
        int i = 1/0;
        String a = null;
        a.length();
    }
}
