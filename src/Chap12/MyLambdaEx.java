package Chap12;

public class MyLambdaEx {
    public static void main(String[] args) {
        MyFunctionalInterface inter = () ->
                System.out.println("매개변수가 없고 리턴값이 없는 람다표현식입니다.");
        MyFunctionalInterface inter1 = () ->
                System.out.println("또 다른 람다");
        inter.method();
        inter1.method();

        MyFunctionalInterface2 inter2 = x -> System.out.println("매개변수로 입력 받은 값: " + x);
        inter2.method(2);

        MyFunctionalInterface3 inter3 = (x, y) -> {
            int multiple = x * y;
            System.out.println(multiple);
            return multiple;
        };
        inter3.method(3,5);

        MyFunctionalInterface5 inter5 = str -> str.length();
        System.out.println(inter5.run("sss"));
    }
}
