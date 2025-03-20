package Quiz0318;

import java.util.function.IntBinaryOperator;

public class LambdaEx_5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 최대값 얻기 구현
        int max = maxOrMin(Integer::max);
        System.out.println("최대값: " + max);

        // 최소값 얻기 구현
        int min = maxOrMin(Integer::min);
        System.out.println("최소값: " + min);
    }
}