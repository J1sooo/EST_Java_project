package Chap11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        System.out.println("리스트 크기: " + list.size());
        System.out.println("리스트 2번째: " + list.get(2));

        list.remove("Servlet/jsp");

        for (String str : list) {
            System.out.println("\t" + str);
        }
    }
}
