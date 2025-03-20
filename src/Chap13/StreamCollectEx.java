package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        Set<Integer> set = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        List<Integer> resultList = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        Map<Integer, Long> map = list.stream()
                .collect(
                        Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                        )
                    );
    }
}
