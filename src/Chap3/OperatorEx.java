package Chap3;

// 부호, 증감 연산자

public class OperatorEx {
    public static void main(String[] args) {
        int x = -800;
        int result2 = -x;
        System.out.println(x);
        System.out.println(result2);

        int num = 10;
        System.out.println(num++);

        ++num;
        System.out.println(num);

        int value = num++;
        System.out.println(value);
    }
}
