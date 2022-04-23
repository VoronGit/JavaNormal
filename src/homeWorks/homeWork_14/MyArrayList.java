package homeWorks.homeWork_14;

public interface MyArrayList<T> {
    void importArray(T[] arr);
    void add(T str);
    void insert(T str, int a);
    void remove(int a);
    void clear();
    T get(int a);
    int size();
    boolean isEmpty();
}
