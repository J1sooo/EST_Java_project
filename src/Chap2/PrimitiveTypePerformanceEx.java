package Chap2;

// 기본 타입(primitive) 연산 성능

public class PrimitiveTypePerformanceEx {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();
        int sum = 0;

        for(int i = 0; i < 1000000; ++i) {
            sum += i;
        }

        long endMs = System.currentTimeMillis() - startMs;
        System.out.println("endMs = " + endMs);
    }
}
