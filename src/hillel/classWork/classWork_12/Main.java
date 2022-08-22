package hillel.classWork.classWork_12;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
