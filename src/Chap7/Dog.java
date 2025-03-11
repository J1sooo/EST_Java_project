package Chap7;

public class Dog extends Animal {
    Dog() {
        super("안녕");
    }

    void sleep(int hour) {
        System.out.println(name + " Zzz... for " + hour + "hours");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.setName("happy");
        dog.sleep();
        dog.sleep(3);
    }
}
