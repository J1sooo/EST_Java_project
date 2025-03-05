package Chap2;

// 문자열 형변환

public class NumberConvertToString {
    public static void main(String[] args) {
        int num = 1234;
        String convert1 = Integer.toString(num);
        String convert2 = String.valueOf(num);
        String convert3 = "" + num;

        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
    }
}
