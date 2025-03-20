package Chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // NoSuchElementException 예외 발생
        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        avg.ifPresent(System.out::println);
    }
}
