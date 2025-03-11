package Chap7.overload;

public class Child extends Parent {
    void method2(String user) {
        System.out.println(user + "Child의 method2 호출");
    }

    public static void main(String[] args) {
        Child child = new Child();

        child.method1(); // Parent의 method1 호출
        child.method2(); // Child의 method2 호출
        child.method2("user");
    }
}
