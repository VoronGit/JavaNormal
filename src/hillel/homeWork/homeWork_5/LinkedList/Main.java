package hillel.homeWork.homeWork_5.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println(myLinkedList);
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        System.out.println(myLinkedList);
        myLinkedList.add("notSecond", 1);
        System.out.println(myLinkedList);
        myLinkedList.add("fifth");
        System.out.println(myLinkedList);
        myLinkedList.add("notFirst", 0);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        myLinkedList.add("notFifth", myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.add("notFourth", 3);
        System.out.println(myLinkedList);
    }
}
