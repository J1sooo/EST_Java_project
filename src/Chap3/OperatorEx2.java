package Chap3;

// 실수, 문자열 동등 비교 연산

public class OperatorEx2 {
    public static void main(String[] args) {
        int x = -800;
        int result2 = -x;
        System.out.println(x);
        System.out.println(result2);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
