package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamLoopingQuizEx {
    public static void main(String[] args) {
/*
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10);
        int sumValue = list.stream()
                .mapToInt(x -> x)
                .peek(System.out::println)
                .sum();
        System.out.println(sumValue);
*/
        int result = IntStream.rangeClosed(5,10)
                .peek(System.out::println)
                .sum();
        System.out.println(result);
    }
}
