package Quiz0310;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("자는 동물: " + getName());
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("호랑이");
        animal.sleep();
    }
}
