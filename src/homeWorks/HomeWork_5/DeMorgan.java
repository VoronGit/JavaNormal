package homeWorks.HomeWork_5;

import java.util.Scanner;

public class DeMorgan {

    static String[][] theorems =
            {
                    {"первую", "!A & !B = !(A | B)"},
                    {"вторую", "!A & B = !(A | !B)"},
                    {"третью", "A & !B  = !(!A | B)"},
                    {"четвертую", "A & B = !(!A | !B)"},
                    {"пятую", "!A | !B = !(A & B)"},
                    {"шестую", "!A | B = !(!A & B)"},
                    {"седьмую", "A | !B = !(!A & B)"},
                    {"восьмую", "A | B = !(!A & !B)"}
            };

    public static void main(String[] args) {
        locals("0", "0", "A", false, (byte) 6, false, false);
        locals("0", "0", "A", false, (byte) 7, false, false);
        locals("0", "0", "A", false, (byte) 8, false, false);
        int num = getTheoremNumber() - 1;
        mainCore(theorems[num][0], theorems[num][1], (byte) num);
    }

    //  Исходное выражение                           Эквивалентное выражение
    //     !A & !B                       =                  !(A | B)
    //     !A & B                        =                  !(A | !B)
    //     A & !B                        =                  !(!A | B)
    //     A & B                         =                  !(!A | !B)
    //     !A | !B                       =                  !(A & B)
    //     !A | B                        =                  !(A & !B)
    //     A | !B                        =                  !(!A & B)
    //     A | B                         =                  !(!A & !B)


    private static void mainCore(String number, String equation, byte num) {

        locals(number, equation, "a", false, (byte) 1, false, false);
        boolean A = getBoolean("A");
        boolean B = getBoolean("B");
        locals(number, equation, "A", A, (byte) 4, false, false);
        locals(number, equation, "B", B, (byte) 4, false, false);
        locals(number, equation, "B", B, (byte) 5, false, false);
        resultCore(A, B, num);
    }

    private static void resultCore(boolean A, boolean B, byte num) {
        boolean right = false;
        boolean left = false;
        switch (num) {
            case 0:
                right = (!A & !B);
                left = (!(A | B));
                break;
            case 1:
                right = (!A & B);
                left = (!(A | !B));
                break;
            case 2:
                right = (A & !B);
                left = (!(!A | B));
                break;
            case 3:
                right = (A & B);
                left = (!(!A | !B));
                break;
            case 4:
                right = (!A | !B);
                left = (!(A & B));
                break;
            case 5:
                right = (!A | B);
                left = (!(A & !B));
                break;
            case 6:
                right = (A | !B);
                left = (!(!A & B));
                break;
            case 7:
                right = (A | B);
                left = (!(!A & !B));
                break;
        }
        locals("0", "A", "B", B, (byte) 10, right, left);
    }

    private static void locals(String number, String equation, String varName, boolean var, byte type, boolean right, boolean left) {
        switch (type) {
            case 1:
                System.out.println("Проверим " + number + " теорему Де Моргана!");
                System.out.println("Действительно ли " + equation + "?");
                break;
            case 2:
                System.out.println("Пожалуйста, задайте значение переменной " + varName + " (true/false):");
                break;
            case 3:
                System.out.println("Вы указали неверные данные, попробуйте снова ввести значение переменной " + varName + " (true/false):");
                break;
            case 4:
                System.out.println("Значение переменной " + varName + ": \"" + var + "\".");
                break;
            case 5:
                System.out.println("Проверяем " + number + " теорему Де Моргана: " + equation + ".");
                break;
            case 6:
                System.out.println("Какую теорему Де Моргана Вы бы хотели проверить?");
                break;
            case 7:
                for (int num = 0; num < theorems.length; num++) {
                    System.out.println((num + 1) + ": " + theorems[num][1] + ".");
                }
                break;
            case 8:
                System.out.println("Выберите теорему из списка введя её номер без точки:");
                break;
            case 9:
                System.out.println("Вы ввели неверные данные, попробуйте снова:");
            case 10:
                System.out.println("Правая часть выражения равна: " + right + ". Левая часть выражения равна: " + left);
        }
    }

    private static boolean getBoolean(String varName) {

        boolean A;
        String AStr;
        locals("0", "0", varName, false, (byte) 2, false, false);
        Scanner scan = new Scanner(System.in);
        do {
            AStr = scan.nextLine();
            if (AStr.equals("true")) {
                A = true;
                break;
            } else if (AStr.equals("false")) {
                A = false;
                break;
            } else{
                locals("0", "0", "B", false, (byte) 9, false, false);
                continue;
            }
        } while (true);

        return A;
    }

    private static int getTheoremNumber() {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            if (scan.hasNextByte()) {
                num = scan.nextInt();
                if ((num <= theorems.length) & (num != 0)) {
                    break;
                } else {
                    locals("0", "0", "B", false, (byte) 9, false, false);
                }
            } else {
                locals("0", "0", "B", false, (byte) 9, false, false);
                scan.next();
            }
        } while (true);
        return num;
    }

}
