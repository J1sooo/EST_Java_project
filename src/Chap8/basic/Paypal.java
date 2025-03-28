package Chap8.basic;

public class Paypal implements Payment {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("process payment $" + amount + ", email: " + email);
    }
}
