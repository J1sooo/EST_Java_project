package Chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDistinctEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","b","c","d","e","e");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("===========");

        List<String> list1 = Arrays.asList("김밥","김밥","김치","나비","나방","나비");
        list1.stream()
                .distinct()
                .filter(x -> x.startsWith("나"))
                .forEach(System.out::println);

        System.out.println("===========");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add(new String("aaa"));
        arrayList.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
