package hillel.homeWork.homeWork_5.linkedList;

interface LinkedList<T> {
    void add(T value);
    void add(T value, int i);
    void remove(int i);
    void remove(T value);
    int size();
    void clear();
    T get(int i);
}