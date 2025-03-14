package Chap9;

public class ATM {
    public static void main(String[] args) {
        int inputMoney = 300000;
        Account account = new Account(100000);

        try {
            account.withdraw(inputMoney);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            // 사용자에게 메시지 보여주기
            // 아무런 처리 하지 않기
        }
    }
}
