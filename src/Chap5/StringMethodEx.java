package Chap5;

import java.util.Arrays;

public class StringMethodEx {
    public static void main(String[] args) {
        String a = "Hello World!";
        System.out.println(a.indexOf("8"));

        boolean isContains = a.contains("World!");
        System.out.println(isContains);

        char ch = a.charAt(8);
        System.out.println("ch is " + ch);

        String replaceValue = a.replaceAll("World", "Spring");
        System.out.println("replaceAll is " + replaceValue);

        String str = "Hello 1234 World!";
        String replaceValue2 = str.replaceAll("\\d", "Spring");
        System.out.println("replaceValue2 is " + replaceValue2);

        String[] arr = str.split(" ");
        System.out.println("arr is " + Arrays.toString(arr));

        String result = "Hello";
        System.out.println(result.concat("!"));   // 결과 : Hello!
        System.out.println(result);
    }
}
