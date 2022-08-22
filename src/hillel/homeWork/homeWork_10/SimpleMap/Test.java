package hillel.homeWork.homeWork_10.SimpleMap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>();
        map.put(1,"Tom2");
        map.put(1,"Jack");
        map.put(2,"Bob");
        map.put(null,"Vlad");
        map.put(null,"Maks");
        map.put(2,"Roman");
        map.put(3,"Evgenii");
        map.put(4,"Ann");
        map.put(20,"Dmitrii");
        System.out.println(map);
        System.out.println(map.size());
        map.remove(null);
        map.remove(20);
        System.out.println(map);
        System.out.println(map.size());
        map.put(19,"Ann2");
        map.put(18,"Sergei");
        map.put(null,"Sergei");
        map.put(0,"Sergei");
        map.put(16,"Sergei");
        System.out.println(map);
        System.out.println(map.size());
        map.remove(16);
        map.remove(0);
        map.remove(null);
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(Arrays.toString(map.getKeySet()));
    }
}
