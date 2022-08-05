package hillel.homeWork.homeWork_6.alishev;

public class Lesson30 {
    public static void main(String[] args) {
        byte x = 123; //-128 127
        long y = 123;
        double a = 12.65;
        float g = 12.65f;

        float f = 123.2f;

        int i1 = 123;
        long l = i1;        //неявное

        int i = (int) l;    //явное
        System.out.println(i);

        int h = 123;
        double h1 = h;
        System.out.println(h1);

        double d1 = 123.6;
        long l1 = Math.round(d1);
        System.out.println(l1);

        byte b1 = (byte) 129;
        System.out.println(b1);
    }
}
