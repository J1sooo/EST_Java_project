package Chap2;

// String -> 숫자 변환

public class StringConvertToNumber {
    public static void main(String[] args) {
        String str = "12345";
        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);
        System.out.println(intValue);
        System.out.println(integerValue);

        // String -> long
        long longValue = Long.parseLong(str);
        System.out.println(longValue);

        // String -> float
        String str2 = "12345.12345";
        float floatValue = Float.parseFloat(str2);
        System.out.println(floatValue);

        // String -> double
        double doubleValue = Double.parseDouble(str2);
        System.out.println(doubleValue);
    }
}
