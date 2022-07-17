package hillel.classWork;

public class NewClass {
    //static int a = 4;
    //static int b = 2 + -4 * 5 - a++ / 4 + --a; // -15 = b 4 = a

    //static int a = 4;
    //static int b = 2 + -4 * 5 - a++ / 4 + a--;  // b = -14 a = 4

    static int a = 4;
    static int b = 2 + -4 * 5 - a++ / 4 + a-- + --a; // b = -16 a = 3
    static long c;

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);


    }



    //int a = 4;
    //int b = 2 + -4 * 5 - a++ / 4 + a-- + --a;
}
