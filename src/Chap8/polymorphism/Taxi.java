package Chap8.polymorphism;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("taxi가 달립니다.");
    }
}
