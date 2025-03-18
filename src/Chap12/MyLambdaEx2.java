package Chap12;

public class MyLambdaEx2 {
    public static void main(String[] args) {
        MyFunctionalInterface4 inter4 = (x, y) ->  x / y;
        System.out.println(inter4.method(6,2));
    }
}
