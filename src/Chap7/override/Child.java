package Chap7.override;

public class Child extends Parent{
    String field2;

    @Override
    void method2() {
        System.out.println("child.method2");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
    }
}
