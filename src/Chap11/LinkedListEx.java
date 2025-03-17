package Chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.addFirst(i + "번째 인덱스 값");
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.addFirst(i + "번째 인덱스 값");
        }

        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTime));
    }
}
