package Chap9;

public class BalanceExceptionSample2 {
    public static void main(String[] args) throws BalanceInsufficientException {
        // 1. try-catch 예외 처리
        // 2. thros 예외 던지기

        throwMethod();
    }
    public static void throwMethod() throws BalanceInsufficientException {
        throw new BalanceInsufficientException("잔금 부족, 잔액: "+ 1000);


    }
}
