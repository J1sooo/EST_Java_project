package Chap12.methoderferance;

public class Calculator {
    // 정적 메소드
    static int staticMethod(int left, int right) {
        return left + right;
    }

    // 인스턴스 메소드
    int instanceMethod(int left, int right) {
        return left + right;
    }
}
