package hillel.classWork;
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
    int size = 0;
    T[] mass = (T[]) new Object[0];

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
        return null;
    }

    @Override
    public void clear() {
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
        arr.remove(2);
        arr.remove(2);
        arr.remove(0);
        arr.add("4");
        System.out.println(arr);
    }
}