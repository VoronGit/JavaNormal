package hillel.homeWork.homeWork_14;

import hillel.homeWork.homeWork_14.enums.Locals;

import java.util.Scanner;

public class UserIntHandler {

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        String string;
        do {
            System.out.println(Locals.GIVEMENUMBERS);
            string = scanner.nextLine();
        } while (string.equals("") || string == null);
        return string.replaceAll("[\\s]+","");
    }

    public static boolean isRepeat() {
        System.out.println(Locals.REPEAT);
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("Да")) return true;
        else if ((string.equals("Нет"))) return false;
        else return isRepeat();
    }
}
