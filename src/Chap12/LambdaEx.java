package Chap12;

public class LambdaEx {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable.run() 출력문");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println("runnable1.run() 출력문");
        runnable1.run();
    }
}
