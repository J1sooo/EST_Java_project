package Chap7;

public class InheritB extends InheritA {
    String field2;

    void method2() {
        System.out.println("InheritB.method2" + field2);
    }

    public static void main(String[] args) {
        InheritB b = new InheritB();
        b.field1 = 1;
        b.method1();
    }
}
