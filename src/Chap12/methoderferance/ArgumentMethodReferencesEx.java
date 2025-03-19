package Chap12.methoderferance;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

//        function = (x, y) -> x.compareToIgnoreCase(y);
        function = String::compareToIgnoreCase;

        System.out.println(function.applyAsInt("java8","JAVA9"));
    }
}
