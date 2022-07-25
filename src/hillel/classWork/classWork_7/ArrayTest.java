package hillel.classWork.classWork_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");


        LinkedList<String> list1 = (LinkedList<String>) list;

        list1.getFirst();
    }
}
