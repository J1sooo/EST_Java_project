package Chap5;

public class NullPointerExceptionEx {
    String field;
    public static void main(String[] args) {
//        int[] array = null;
//        array[4] = 100;

        String str = "";
        System.out.println(str.equals(10));

        NullPointerExceptionEx npe = new NullPointerExceptionEx();
        npe.method();
        System.out.println(npe.field);

    }

    void method() {}

}
