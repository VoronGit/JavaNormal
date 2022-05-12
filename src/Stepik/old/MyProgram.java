package Stepik.old;

import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n > 0) doi(1, n);
        else System.out.println("NO");
    }
    static void doi(long i, long n) {
        if (i < n) {
            if (n%5 == 0) doi(i*5, n);
            else doi(i + 3, n);
        }
        if (i == n) System.out.println("YES");
        else if (i > n) System.out.println("NO");
        return;
    }
}