package Chap8.basic;

public class Order {
    public static void main(String[] args) {
        double amount = 100.34;
//        Payment creditCard = new CreditCard("12345-12345");
//        Payment paypal = new Paypal("email@email.com");

//        creditCard.processPayment(amount);
//        paypal.processPayment(amount);

        pay("creditCard",amount);
    }

    static void pay(String paymentMethod, double amount){
        Payment payment;
        if(paymentMethod.equals("creditCard")){
            payment = new CreditCard("12345-12345");
        } else if (paymentMethod.equals("naverPay")) {
            payment = new NaverPay();
        } else {
            payment = new Paypal("sample@email.com");
        }
        payment.processPayment(amount);
    }
}
