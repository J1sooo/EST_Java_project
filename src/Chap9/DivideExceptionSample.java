package Chap9;

public class DivideExceptionSample {
    static void printByeMessage() {
        System.out.println("안녕히계세요");
    }

    public static void main(String[] args) {
        int inputValue = Integer.parseInt(args[0]);
        int result = 0;
        try {
            result = 5 / inputValue;
//            printByeMessage();
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("오류: " + e.getMessage());
        } finally {
            System.out.println("최종 result 값: " + result);
            printByeMessage();
        }
    }
}
