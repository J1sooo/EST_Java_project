package Chap10;

public class GenericTypeBoundMethodEx {
    public static void main(String[] args) {
        int result = Util.compare(4, 5);
        System.out.println(result);

        int result2 = Util.compare(4.1, 4.1);
        System.out.println(result2);
    }
}
