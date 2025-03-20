package Chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;

public class StreamSortingEx {
    public static void main(String[] args) {
        String[] arr = {"z","a","r","s","t"};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::print);

        System.out.println("\n============");

        Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
