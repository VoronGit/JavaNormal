package homeWorks.HomeWork_9;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        //System.arraycopy(arr, 3, arr, 2, 3);
        arr = Arrays.copyOf(arr, 5);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
