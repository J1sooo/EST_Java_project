package WeeklyQuiz1;

public class Product implements Promotion{
    private final String name;
    private final int price;
    private final int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price-getDiscountAmount();
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
