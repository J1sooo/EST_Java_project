package WeeklyQuiz1;

public class Cart {
    private final Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int delivery;
        int totalPrice = 0;
        int totalWeight = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
            totalWeight += product.getWeight();
        }

        if (totalWeight<3) {
            delivery = 1000;
        } else if (totalWeight<10) {
            delivery = 5000;
        } else {
            delivery = 10000;
        }

        if (totalPrice>=30000 && totalPrice<100000) {
            delivery -= 1000;
        } else if (totalPrice>=100000) {
            delivery = 0;
        }

        return delivery;
    }
}
