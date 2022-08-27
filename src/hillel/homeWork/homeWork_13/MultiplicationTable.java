package hillel.homeWork.homeWork_13;

public class MultiplicationTable {
    public static void main(String[] args) {
        getTable(2);
        System.out.println();
        getTable(6);
    }

    public static void getTable(int start) {
        for (int i = 2; i <= 9; i++) {
            for (int j = start; j <= start + 3; j++) {
                System.out.printf("%d * %d = %-2d      ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
