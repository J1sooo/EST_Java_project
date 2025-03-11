package Chap7.override;

public class Calculator {
    static final double PI = 3.141592;
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return PI * r * r;
    }
}
