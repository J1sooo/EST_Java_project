package Chap4;

import java.util.Scanner;

public class GoogoodanUserEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 숫자 입력: ");
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
