package hillel.classWork.classWork_13;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test6 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new ArrayBlockingQueue<>(2);
        stringQueue.add("Roman");
        stringQueue.add("Sergei");
        System.out.println(stringQueue.offer("Sergei"));

        stringQueue.remove();
        stringQueue.remove();
        stringQueue.poll();
        //System.out.println(stringQueue.poll());

        System.out.println(stringQueue.peek());

        System.out.println(stringQueue.offer("Sergei"));

        System.out.println(stringQueue);

        System.out.println(stringQueue.offer("Sergei"));

        System.out.println(stringQueue.element());
        System.out.println(stringQueue.peek());
    }
}
