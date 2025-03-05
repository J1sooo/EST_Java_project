package Chap3;

// 증감 연산자 실습

public class IncreaseDecreaseOperatorEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("----------------------");
        ++x;
        ++x;
        System.out.println("x=" + x);
        System.out.println("----------------------");
        --y;
        --y;
        System.out.println("y=" + y);
        System.out.println("----------------------");
        int z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("----------------------");
        ++x;
        System.out.println("z=" + x);
        System.out.println("x=" + x);
        System.out.println("----------------------");
        ++x;
        z = x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
