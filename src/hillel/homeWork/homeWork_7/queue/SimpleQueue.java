package hillel.homeWork.homeWork_7.queue;

import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class SimpleQueue<T> {

    private T[] queueArray;
    private int front;
    private int tail;
    private int nItem;

    public SimpleQueue() {
        this.queueArray = (T[]) new Object[0];
        this.front = 0;
        this.tail = -1;
        this.nItem = 0;
    }

    public void add(T element) {
        queueArray = Arrays.copyOf(queueArray, queueArray.length + 1);

        queueArray[++tail] = element;
        nItem++;
    }

    public void remove() {
        if (queueArray.length == 0) {
            return;
        } else {
            ++front;
            T[] arr = (T[]) new Object[queueArray.length - 1];
            System.arraycopy(queueArray, front, arr, 0, queueArray.length - 1);
            queueArray = arr;
            nItem--;
        }
    }

    public void add(T[] element) {
        queueArray = Arrays.copyOf(queueArray, queueArray.length + element.length);

        for (int i = 0; i < element.length; i++) {
            queueArray[++tail] = element[i];
        }
        nItem += element.length;
    }

    public int size() {
        return nItem;
    }

    @Override
    public String toString() {
        return Arrays.toString(queueArray);
    }
}
