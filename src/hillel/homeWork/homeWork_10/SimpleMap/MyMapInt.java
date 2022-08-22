package hillel.homeWork.homeWork_10.SimpleMap;

public interface MyMapInt<K,V> {
    void put(K key, V value);
    V get(K key);
    int size();
    boolean remove(K key);
    K[] getKeySet();
}
