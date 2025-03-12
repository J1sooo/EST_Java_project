package Chap8.polymorphism;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("bus가 달립니다.");
    }
}
