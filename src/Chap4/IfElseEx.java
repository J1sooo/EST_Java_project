package Chap4;

// if else

public class IfElseEx {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        if (score >= 90) {
            System.out.println("등급은 A입니다");
        } else if (score >= 80) {
            System.out.println("등급은 B입니다");
        } else if (score >= 70) {
            System.out.println("등급은 C입니다");
        } else {
            System.out.println("등급은 D입니다");
        }
    }
}
