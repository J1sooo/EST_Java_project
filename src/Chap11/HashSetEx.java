package Chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("닝닝");
        set.add("카리나");
        set.add("윈터");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

        set.remove("윈터");
        set.clear();

        System.out.println(set.size());
    }
}
