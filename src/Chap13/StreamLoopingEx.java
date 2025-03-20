package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamLoopingEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        OptionalInt maxValueOpt = list.stream()
                .mapToInt(Integer::intValue)
                .filter(x -> x%2==0)
                .peek(System.out::println)
                .max();
        int maxValue = maxValueOpt.orElse(0);
        System.out.println("maxValue: " + maxValue);
    }
}
