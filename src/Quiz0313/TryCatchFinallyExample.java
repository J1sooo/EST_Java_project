package Quiz0313;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        String strArray[] = {"10", "23b"};
        int value = 0;
        for (int i = 0; i < 2; i++) {  // 루프 2번 실행됨
            try {
                value = Integer.parseInt(strArray[i]);  // 정수 변환 시도
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과하였음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);  // finally 블록은 항상 실행됨!
            }
        }
    }
}

