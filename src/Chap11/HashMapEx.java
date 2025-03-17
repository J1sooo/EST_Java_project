package Chap11;


import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("홍길동", 80);
        map.put("카리나", 90);
        map.put("윈터", 70);
        map.put("홍길동", 20);

        System.out.println(map.size());

        System.out.println("카리나 점수: " + map.get("카리나"));
        System.out.println(map.getOrDefault("지젤", 0));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }

        System.out.println("======================");

        map.remove("홍길동");

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }

        map.clear();
        if (map.isEmpty()) {
            System.out.println("비어 있는 HashMap");
        }
    }
}
