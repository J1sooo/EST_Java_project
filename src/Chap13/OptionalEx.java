package Chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
//        System.out.println(empty.get());
        String str = null;
        Optional<String> optional1 = Optional.ofNullable(str);

        str = "";
        Optional<String> optional2 = Optional.of(str);

        // NullPointerException을 방지하는 Optional 사용하기
        List<String> list = null;
        Optional.ofNullable(list)
                .orElse(new ArrayList<>())
                .forEach(System.out::println);
    }
}
