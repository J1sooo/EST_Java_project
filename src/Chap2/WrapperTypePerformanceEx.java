package Chap2;

// 래퍼 타입(Wrapper) 연산 성능

public class WrapperTypePerformanceEx {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();
        Integer sum = 0;

        for(int i = 0; i < 1000000; ++i) {
            sum = sum + i;
        }

        long endMs = System.currentTimeMillis() - startMs;
        System.out.println("endMs = " + endMs);
    }
}
