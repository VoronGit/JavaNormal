package hillel.homeWork.homeWork_3;
import java.util.Arrays;

interface ArrayListInt<T> {
    void add(T obj);
    int size();
    void remove(int i);
    T get(int i);
    void clear();
    String toString();
}

public class MyArrayList<T> implements ArrayListInt<T> {
    private int size = 0;
    private T[] mass = (T[]) new Object[0];

    @Override
    public void add(T obj) {
        size++;
        mass = Arrays.copyOf(mass,size);
        mass[size-1] = obj;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int i) {
        size--;
        T[] temp = (T[]) new Object[size];
        System.arraycopy(mass,0,temp,0,i);
        System.arraycopy(mass,i + 1,temp,i,mass.length - i - 1);
        mass = temp;
    }

    @Override
    public T get(int i) {
        return mass[i];
    }

    @Override
    public void clear() {
        size = 0;
        mass = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(mass);
    }
}

class Main {
    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(2);
        arr.remove(2);
        arr.remove(0);
        arr.add("4");
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        System.out.println(arr);
        arr.add("5");
        arr.add("6");
        arr.add("7");
        System.out.println(arr);
        System.out.println(arr.size());
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.size());

        MyArrayList<Integer> arr1 = new MyArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        System.out.println(arr1);
        System.out.println(arr1.size());
        arr1.remove(2);
        arr1.remove(2);
        arr1.remove(0);
        arr1.add(4);
        System.out.println(arr1);
        System.out.println(arr1.size());
        System.out.println(arr1.get(1));
        System.out.println(arr1);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        System.out.println(arr1);
        System.out.println(arr1.size());
        arr1.clear();
        System.out.println(arr1);
        System.out.println(arr1.size());
    }
}