package hillel.classWork.classWork_13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test5 {
    public static void main(String[] args) {
        Map<Integer,String> personStringMap = new HashMap<>();
        Map<Integer,String> personStringLinkedMap = new LinkedHashMap<>();
        Map<Integer,String> personStringTreeMap = new TreeMap<>( ((o1, o2) -> o2 - o1));
        //testMap(personStringMap);
        //testMap(personStringLinkedMap);
        testMap(personStringTreeMap);

    }
    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        //не могут быть один ключи но значения могут

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
