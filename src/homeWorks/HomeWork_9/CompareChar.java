import java.util.Scanner;

public class CompareChar {

    public static void main(String[] args) {
        while (true) {
            int finalAns = 0;
            String forAnswer = null;
            String userString = getString();
            String[] feelArray = {"anger", "awe", "joy", "love", "grief"};
            for (String feelString : feelArray) {
                if (countEngine(feelString, userString) > 0) {
                    finalAns++;
                    if (finalAns > 1) forAnswer = forAnswer + ", " + feelString;
                    else forAnswer = feelString;
                }
            }
            if (finalAns > 0) {
                System.out.println("Из пользовательской строки: " + userString + "," + getEndingByNumber(finalAns) + forAnswer + ".");
            } else {
                System.out.println("Из пользовательской строки: " + userString + "," + getEndingByNumber(finalAns));
            }
        }
    }

    static int countEngine(String template, String string) {
        int num = 0;
        int ans = 0;
        char[] charTemplate = convertToChar(template);
        char[] charString = convertToChar(string);
        int ctl = charTemplate.length;
        int csl = charString.length;
        int n = (int) (csl / ctl);
        while (n > 0) {
            for (int i = 0; i < ctl; i++) {
                for (int j = 0; j < csl; j++) {
                    if (charTemplate[i] == charString[j]) {
                        charString[j] = 0;
                        num++;
                        break;
                    }
                }
            }
            n--;
            ans += num / (ctl);
            num = 0;
        }
        return ans;
    }

    static char[] convertToChar(String string) {
        byte[] bytes = string.getBytes();
        char[] chars = new char[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            chars[i] = (char) bytes[i];
        }
        return chars;
    }

    static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите набор символов, которые нужно проверить:");
        String string = scan.nextLine();
        return string;
    }

    static String getEndingByNumber(int num) {
        String ans = null;
        if (num == 0) ans = " нельзя составить ни одного названия чувства.";
        if (num == 1) ans = " можно составить название только " + num + " чувства. Это чувство: ";
        if ((num > 1) && (num < 5)) ans = " можно составить " + num + " названия чувства. Это чувства: ";
        if (num > 4) ans = " можно составить все " + num + " названий чувств. Это чувства: ";
        return ans;
    }
}
