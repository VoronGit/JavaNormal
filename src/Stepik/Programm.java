package Stepik;
import java.util.Scanner;

class Programm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = (int) Math.pow(10,n-1); i <= Math.pow(10,n) - 1; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            boolean isNeed = true;
            for (char charJ : chars) {
                if(Integer.parseInt(String.valueOf(charJ)) <= k && Integer.parseInt(String.valueOf(charJ)) > 0) {
                    continue;
                } else {
                    isNeed = false;
                }
            }
            if (isNeed) {
                for (int j = 0; j < chars.length; j++) {
                    stringBuilder.append(chars[j]);
                    if (j < chars.length - 1) stringBuilder.append(" ");
                }
            stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}