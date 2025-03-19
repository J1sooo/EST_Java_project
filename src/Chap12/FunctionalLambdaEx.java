package Chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalLambdaEx {
    public static void main(String[] args) {
        // Supplier<T>
        Supplier<String> supplier = () -> "리턴 값만 있음";
        System.out.println("Supplier: " + supplier.get());

        // Consumer<T>
        Consumer<Integer> consumer = x -> System.out.println("consumer: " + x);
        consumer.accept(221);

        // Function<T,R>
        Function<Integer, String> function = String::valueOf;
        String returnValue = function.apply(23);
        System.out.println("Function 타입 정의 결과: " + returnValue);

        Function<String, Integer> function2 = b -> Integer.parseInt(b) + 50;
        int returnValue2 = function2.apply("424");
        System.out.println("Function 타입 정의 결과: " + returnValue2);

        // Predicate<T>
        Predicate<Integer> predicate = x -> x % 2 == 1;
        if (predicate.test(1)) {
            System.out.println("1은 홀수입니다.");
        }
    }
}
