package Chap4;

import java.util.Scanner;

public class BackNumberEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.print(i);
        }
    }
}
