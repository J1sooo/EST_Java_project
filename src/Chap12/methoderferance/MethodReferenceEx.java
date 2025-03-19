package Chap12.methoderferance;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
    public static void main(String[] args) {
        IntBinaryOperator operator;

//        operator = (x, y) -> Calculator.staticMethod(x, y); // 람다식
        operator = Calculator::staticMethod; // 메소드 참조

        Calculator calculator = new Calculator();
//        operator = (x, y) -> calculator.instanceMethod(x, y);
        operator = calculator::instanceMethod;

        System.out.println(operator.applyAsInt(2,3));
    }
}
