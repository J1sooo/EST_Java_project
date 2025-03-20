package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d","e");

        List<String> newlist = list.stream()
                .map(String::toUpperCase)
                .toList(); // .collect(Collectors.toList());
        System.out.println(newlist);

        System.out.println("==================");

        List<String> list1 = Arrays.asList("Hello world", "Java stream");
        List<String> newlist2 = list1.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .toList();
        System.out.println(newlist2);
    }
}
