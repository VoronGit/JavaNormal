package hillel.classWork.classWork_12;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //int[] arr = new int[3];
        //for (int i = 0; i <= 4; i++) {
        //    arr[i] = i;
        //}

        ArrayList<Integer> arrayList = new ArrayList<>(3);

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
//
        //System.out.println(arrayList);
        //for (Integer i : arrayList) {
        //    System.out.println(i);
        //}
//
        //for (int i = 0; i < arrayList.size(); i++) {
        //    System.out.println(arrayList.get(i));
        //}

        //Iterator<Integer> iterator = arrayList.iterator();
//
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next());
        //}

        arrayList.remove(3); //  [0] -> [1] -> [2] -> [3] -> [4]
        arrayList.forEach(System.out::println);

        List<Integer> linkedList = new LinkedList<>(arrayList);

        linkedList.forEach(System.out::println);
    }
}

class ForTests {
    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        //long currentTimeArray = System.currentTimeMillis();
        //insert1000000(arrayList);
        //long completionTimeArray = System.currentTimeMillis();
//
        //long currentTimeLinked = System.currentTimeMillis();
        //insert1000000(linkedList);
        //long completionTimeLinked = System.currentTimeMillis();
//
        //System.out.println("ArrayList insert time is: " + (completionTimeArray - currentTimeArray));
        //System.out.println("LinkedList insert time is: " + (completionTimeLinked - currentTimeLinked));

        //long currentTimeArrayGet = System.currentTimeMillis();
        //get10000(arrayList);
        //long completionTimeArrayGet = System.currentTimeMillis();
//
        //long currentTimeLinkedGet = System.currentTimeMillis();
        //get10000(linkedList);
        //long completionTimeLinkedGet = System.currentTimeMillis();
//
        //System.out.println("ArrayList get time is: " + (completionTimeArrayGet - currentTimeArrayGet));
        //System.out.println("LinkedList get time is: " + (completionTimeLinkedGet - currentTimeLinkedGet));

        long currentTimeArrayInFront = System.currentTimeMillis();
        insertInFront(arrayList);
        long completionTimeArrayInFront = System.currentTimeMillis();

        long currentTimeLinkedInFront = System.currentTimeMillis();
        insertInFront(linkedList);
        long completionTimeLinkedInFront = System.currentTimeMillis();

        System.out.println("ArrayList insert time is: " + (completionTimeArrayInFront - currentTimeArrayInFront));
        System.out.println("LinkedList insert time is: " + (completionTimeLinkedInFront - currentTimeLinkedInFront));
    }

    public static void insert1000000(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
    public static void get10000(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
    public static void insertInFront(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0,i);   // [-1] -> [0] -> [1] -> [2] -> [3] -> [4]
        }
    }
}
