package Chap13;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalEx2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        String strDefault = optional.orElse("문자열");
        System.out.println("default value: " + strDefault);

        Optional<List<String>> optional1 = Optional.ofNullable(null);
        optional1.orElseGet(LinkedList::new)
                .forEach(System.out::println);

        optional1.orElseThrow(() -> new RuntimeException());
    }
}
