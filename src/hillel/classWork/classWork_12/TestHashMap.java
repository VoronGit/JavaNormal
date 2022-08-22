package hillel.classWork.classWork_12;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(4));

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Integer key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
