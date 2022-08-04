package hillel.homeWork.homeWork_7.queue;

import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class SimpleQueue {

    private int[] queueArray;
    private int front;
    private int tail;
    private int nItem;

    public SimpleQueue() {
        this.queueArray = new int[0];
        this.front = 0;
        this.tail = -1;
        this.nItem = 0;
    }

    public void add(int element) {
        queueArray = Arrays.copyOf(queueArray, queueArray.length + 1);

        queueArray[++tail] = element;
        nItem++;
    }

    public void remove() {
        if (queueArray.length == 0) {
            return;
        } else {
            ++front;
            int[] arr = new int[queueArray.length - 1];
            System.arraycopy(queueArray, front, arr, 0, queueArray.length - 1);
            queueArray = arr;
        }
    }

    public void add(int[] element) {

    }

    @Override
    public String toString() {
        return Arrays.toString(queueArray);
    }
}
