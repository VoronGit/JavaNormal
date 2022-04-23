package homeWorks.homeWork_14;

import java.util.Arrays;

class MyArrayListImpl<T> implements MyArrayList {
    private T[] strArr = (T[]) new Object[0];
    private int index = 0;
    @Override
    public void importArray(Object[] arr) {
        index = arr.length;
        strArr = (T[]) Arrays.copyOf(arr, index);
    }

    @Override
    public void add(Object str) {
        strArr = Arrays.copyOf(strArr, index + 1);
        strArr[index] = (T) str;
        index++;
    }
    @Override
    public void insert(Object str, int a) {
        if (a <= index) {
            T[] firstPart = (T[]) new Object[a];
            T[] secondPart = (T[]) new Object[index - a + 1];
            T[] newArray = (T[]) new Object[index + 1];
            System.arraycopy(strArr, 0, firstPart, 0, a);
            System.arraycopy(strArr, a, secondPart, 0, index - a);
            for (int i = 0; i <= index; i++) {
                if (i < a) newArray[i] = firstPart[i];
                else if (i == a) newArray[i] = (T) str;
                else newArray[i] = secondPart[i - a - 1];
            }
            index++;
            strArr = newArray;
        }
    }

    @Override
    public void remove(int a) {
        if (!(index == 0) && (a < index)) {
            T[] firstPart = (T[]) new Object[a];
            T[] secondPart = (T[]) new Object[index - a - 1];
            T[] newArray = (T[]) new Object[index - 1];
            System.arraycopy(strArr, 0, firstPart, 0, a);
            System.arraycopy(strArr, a + 1, secondPart, 0, index - a - 1);
            for (int i = 0; i < index - 1; i++) {
                if (i < a) newArray[i] = firstPart[i];
                else newArray[i] = secondPart[i - a];
            }
            index--;
            strArr = newArray;
        }
    }

    @Override
    public T get(int a) {
        if (a < index)
            return strArr[a];
        else return null;
    }

    @Override
    public void clear() {
        index = 0;
        strArr = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0 ? true : false;
    }

    @Override
    public String toString() {
        return Arrays.toString(strArr);
    }
}
