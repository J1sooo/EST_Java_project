package Chap6;

public class Car {
    private String name;
    private String model;
    private int maxSpeed;

    // 생성자
    Car() {
        this.name = "초기화값";
    }

    Car(String name) {
        this.name = name;
        this.maxSpeed = 200; // 기본적인 maxSpeed로 초기화 가능
    }

    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.maxSpeed = 200;
    }

    Car(String name, String model, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // 리턴 타입이 없는 메소드
    void enginStart() {
        System.out.println("Engine Start");
    }

    // 리턴 타입이 있는 메소드
    int returnMaxSpeed(int speed) {
        System.out.println("현재 스피드: " + speed);
        return maxSpeed;
    }

    public static void main(String[] args) {
        Car ferrari = new Car("ferrari");
        System.out.println(ferrari.name);

        Car sonata = new Car("sonata");
        System.out.println(sonata.name);

        Car car = new Car();

        Car sportage = new Car("kia", "sportage");

        Car bmw = new Car("bmw", "520d", 100);

        System.out.println(car.name);
        System.out.println(sportage.maxSpeed);
        System.out.println(bmw.name + bmw.model + bmw.maxSpeed);
        bmw.enginStart();
        int value2 = bmw.returnMaxSpeed(300);
        System.out.println(value2);
//        void value = bmw.enginStart();
    }
}
