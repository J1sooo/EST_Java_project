package Chap12.methoderferance;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

public class ConstructorReferenceEx {
    public static void main(String[] args) {
        Function<String, Member> function;

//        function = str -> new Member(str);
        function = Member::new;
        Member member = function.apply("id1");
        System.out.println(member.getId() + " | " + member.getName());

        BiFunction<String, String, Member> biFunction;
//        biFunction = (str1, str2) -> new Member(str1, str2);
        biFunction = Member::new;
        member = biFunction.apply("Kim", "id2");
        System.out.println(member.getId() + " | " + member.getName());
    }
}
