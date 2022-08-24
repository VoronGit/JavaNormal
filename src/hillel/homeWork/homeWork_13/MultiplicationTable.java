package hillel.homeWork.homeWork_13;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d * %d = %-2d      ",j,i,i*j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d * %d = %-2d      ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
