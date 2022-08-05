package hillel.homeWork.homeWork_9.mapExample;

import java.util.HashMap;
import java.util.Scanner;

public class MapExample {
    private static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");

        do {
            System.out.println(map.get(getMenu().get(getNumber())));
        } while (getAnswer());
    }

    public static HashMap<Integer, String> getMenu() {
        System.out.println("Выберите город, семью из которого нужно вывести:");
        HashMap<Integer, String> tempMap = new HashMap<>();
        int counter = 1;
        for (String key : map.keySet()) {
            System.out.printf("%d. %s", counter, key);
            System.out.println();
            tempMap.put(counter++, key);
        }
        return tempMap;
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                int a = Integer.parseInt(sc.nextLine());
                if (a <= map.size()) {
                    return a;
                }
            }
            System.out.println("Введите число, которое отображено на экране!");
        }
    }

    public static boolean getAnswer() {
        System.out.println("Желаете попробовать снова (Да/Нет)?");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextLine()) {
                String a = sc.nextLine();
                if (a.equals("Да")) {
                    return true;
                } else if (a.equals("Нет")) {
                    return false;
                }
            }
            System.out.println("Введите Да или Нет!");

        }

    }
}
