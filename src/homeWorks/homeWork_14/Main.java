package homeWorks.homeWork_14;

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl<String> myArrayList1 = new MyArrayListImpl();
        System.out.println(myArrayList1.isEmpty());
        System.out.println(myArrayList1.size());
        myArrayList1.add("a");
        myArrayList1.add("b");
        myArrayList1.add("c");
        myArrayList1.add("d");
        System.out.println(myArrayList1.get(0));
        System.out.println(myArrayList1.get(1));
        System.out.println(myArrayList1.get(2));
        System.out.println(myArrayList1.get(3));
        System.out.println(myArrayList1.get(4));
        System.out.println(myArrayList1);
        myArrayList1.remove(0);
        System.out.println(myArrayList1);
        myArrayList1.add("b");
        System.out.println(myArrayList1);
        myArrayList1.remove(3);
        System.out.println(myArrayList1);
        myArrayList1.insert("a",0);
        System.out.println(myArrayList1);
        myArrayList1.add("z");
        System.out.println(myArrayList1);
        System.out.println(myArrayList1.size());
        myArrayList1.clear();
        System.out.println(myArrayList1);
        System.out.println(myArrayList1.isEmpty());
        System.out.println(myArrayList1.size());
        myArrayList1.add("a");
        myArrayList1.add("b");
        myArrayList1.add("c");
        myArrayList1.add("d");
        System.out.println(myArrayList1);
        System.out.println(myArrayList1.size());
        Integer[] arr = {1,2,3};
        MyArrayListImpl<Integer> myArrayList2 = new MyArrayListImpl();
        myArrayList2.importArray(arr);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.size());
        myArrayList2.insert(4, 3);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.size());
        myArrayList2.remove(1);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.get(0));
        System.out.println(myArrayList2.size());
    }
}