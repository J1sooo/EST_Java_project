package Chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("DBMS");

        System.out.println("총 객체수: "+ set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        set.remove("DBMS");
        set.remove("Spring");

        System.out.println("총 객체수: "+ set.size());
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("빈 set 객체");
        }
    }
}
