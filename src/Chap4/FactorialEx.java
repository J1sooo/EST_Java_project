package Chap4;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));

//        int answer = 1;
//        for (int i = 1; i <= num; i++) {
//            answer *= i;
//        }
//        System.out.println(answer);
    }
    public static long factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }
}
