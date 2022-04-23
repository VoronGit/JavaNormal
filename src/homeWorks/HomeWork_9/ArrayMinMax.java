import java.util.Arrays;

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] arr = giveMeRandomArray();
        System.out.println("Был задан массив: " + Arrays.toString(arr)+ "\n" +
                "Максимальное значение " + countMax(arr)[0] + " в заданном массиве встречается " + countMax(arr)[1] + " раз(-а).\n"+
                "Минимальное значение " + countMin(arr)[0] + " в заданном массиве встречается " + countMin(arr)[1] + " раз(-а).");
    }

    static int[] giveMeRandomArray() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            if (Math.random() > 0.5) array[i] = (int) (Math.random() * 10);
            else array[i] = (int) -(Math.random() * 10);
        }
        return array;
    }

    static int[] countMax(int[] array) {
        int max = array[0];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                num = 1;
            } else if (array[i] == max) num++;
        }
        return new int[]{max, num};
    }

    static int[] countMin(int[] array) {
        int min = array[0];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                num = 1;
            } else if (array[i] == min) num++;
        }
        return new int[]{min, num};
    }
}
