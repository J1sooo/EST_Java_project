package Chap3;

// 실수, 문자열 동등 비교 연산

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        char grade = (score > 90) ? 'A' : (score > 85 ? 'B' : 'C');

        System.out.println("당신의 점수는"+grade);
    }
}
