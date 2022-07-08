package Stepik.lesson_5_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int strNum = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= strNum; i++) {
            String line = sc.nextLine();
            if (line.toLowerCase().contains("камаз")) {
                num++;
            }
        }
        System.out.println(num);
    }
}