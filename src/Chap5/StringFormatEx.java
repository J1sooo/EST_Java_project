package Chap5;

import java.text.MessageFormat;

public class StringFormatEx {
    public static void main(String[] args) {
        String name = "Tim";
        int age = 38;
        String str = String.format("%s의 나이는 %d세 입니다.", name, age);
        System.out.println(str);
        System.out.printf("%s의 나이는 %d세 입니다.", name, age);

        String formatResult = MessageFormat.format("{0}의 나이는 {1}", name, age);
        System.out.println(formatResult);
    }
}
