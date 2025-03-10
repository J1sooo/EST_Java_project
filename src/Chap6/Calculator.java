package Chap6;

public class Calculator {
    static final double PI = 3.14;
    int result;

//    int postfixOperator(int a) {
//        a++;
//        return a;
//    }

    void postfixOperator() {
        result++;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
//        int result = calculator.postfixOperator(a);
//        System.out.println(result);
        calculator.result = 1;
        calculator.postfixOperator();
        System.out.println(calculator.result);
        System.out.println(PI);
    }
}
