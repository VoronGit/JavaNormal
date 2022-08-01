package hillel.homeWork.homeWork_2.alishev;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст:");
        String age = scanner.nextLine();
        switch (age) {
            case "ноль" :
                System.out.println("Ты родился!");
                break;
            case "семь" :
                System.out.println("Ты пошел в школу!");
                break;
            case "восемнадцать" :
                System.out.println("Ты закончил школу!");
                break;
        }
    }
}
