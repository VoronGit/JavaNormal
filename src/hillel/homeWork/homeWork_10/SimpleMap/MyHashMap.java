package hillel.homeWork.homeWork_10.SimpleMap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMapInt {
    private int size;
    private Node[] arr;
    private static final double LOAD_FACTOR = 0.75;

    @Override
    public void put(Object key, Object value) {
        grow();
        Node<K, V> entry = new Node(key, value);
        if (arr[getIndexFromHash((K) key)] == null) {
            arr[getIndexFromHash((K) key)] = entry;
        } else {
            Node<K, V> tempEntry = arr[getIndexFromHash(entry.getKey())];
            while (tempEntry.next() != null) {
                if (Objects.equals(tempEntry.getKey(),key)) {
                    tempEntry.setValue((V) value);
                    return;
                }
                tempEntry = tempEntry.next();
            }
            if (Objects.equals(tempEntry.getKey(),key)) {
                tempEntry.setValue((V) value);
                return;
            }
            tempEntry.setNext(entry);
        }
        size++;
    }

    @Override
    public V get(Object key) {
        Node<K, V> tempEntry = arr[getIndexFromHash((K) key)];
        while (tempEntry != null) {
            if (Objects.equals(tempEntry.getKey(), key)) {
                return tempEntry.getValue();
            }
            tempEntry = tempEntry.next();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object key) {
        int index = getIndexFromHash((K) key);
        if (arr[index] == null) return false;
        Node<K, V> tempEntry = arr[index];
        Node<K, V> tempPrevEntry = tempEntry;
        while (tempEntry != null) {
            if (Objects.equals(tempEntry.getKey(), key)) {
                if (tempEntry.next() != null) {
                    if (tempPrevEntry == tempEntry) {
                        arr[index] = tempEntry.next();
                    } else {
                        tempPrevEntry.setNext(tempEntry.next());
                    }
                } else {
                    if (tempPrevEntry == tempEntry) {
                        arr[index] = null;
                    } else {
                        tempPrevEntry.setNext(null);
                    }
                }
                size--;
                return true;
            }
            tempPrevEntry = tempEntry;
            tempEntry = tempEntry.next();
        }
        return false;
    }

    @Override
    public K[] getKeySet() {
        K[] keys = (K[]) new Object[size];
        int counter = 0;
        for (Node<K, V> entry : arr) {
            if (entry != null) {
                keys[counter++] = (K) entry.getKey();
                while (entry.next() != null) {
                    keys[counter++] = (K) entry.next().getKey();
                    entry = entry.next();
                }
            }
        }
        return keys;
    }

    private int getIndexFromHash(K key) {
        if (key == null) return 0;
        else return key.hashCode() % arr.length;
    }

    private void putNode(Node<K, V> entry) {
        if (arr[getIndexFromHash(entry.getKey())] == null) {
            arr[getIndexFromHash(entry.getKey())] = entry;
        } else {
            Node<K, V> tempEntry = arr[getIndexFromHash(entry.getKey())];
            while (tempEntry.next() != null) {
                tempEntry = tempEntry.next();
            }
            tempEntry.setNext(entry);
        }
    }

    private void grow() {
        if (arr == null || arr.length == 0) arr = new Node[16];
        else if (size >= (int) arr.length * LOAD_FACTOR) {
            int newCapacity = arr.length << 1;
            Node<K, V>[] tempArr = arr;
            arr = new Node[newCapacity];
            for (Node<K, V> entry : tempArr) {
                if (entry != null) {
                    putNode(entry);
                    Node<K, V> tempEntry = entry.next();
                    while (tempEntry != null) {
                        putNode(tempEntry);
                        tempEntry = tempEntry.next();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<K, V> node : arr) {
            if (node != null) {
                sb.append(node);
                sb.append("\n");
                while (node.next() != null) {
                    sb.append(node.next());
                    sb.append("\n");
                    node = node.next();
                }
            }
        }
        return sb.toString();
    }

    private class Node<K, V> {
        private K key;
        private V value;
        private Node next = null;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return key + " : " + value;
        }
    }
}
