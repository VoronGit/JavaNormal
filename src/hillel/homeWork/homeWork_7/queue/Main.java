package hillel.homeWork.homeWork_7.queue;

public class Main {
    public static void main(String[] args) {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.add("one");
        queue.add("two");
        System.out.println(queue);
        System.out.println(queue.size());
        queue.add(new String[]{"three","four"});
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
