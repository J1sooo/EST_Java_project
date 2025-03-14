package Chap9;

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException() {

    }

    public BalanceInsufficientException(String errorMessage) {
        super(errorMessage);
    }
}
