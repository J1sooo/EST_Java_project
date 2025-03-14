package Chap10;

public class GenericTypeEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject(100);
        int value = (int) box.getObject();
        System.out.println("제네릭 타입 사용 X: " + value);

        Box<String> box2 = new Box<>();
        box2.setObject("문자열");
        String str = box2.getObject();
        System.out.println("제네릭 타입 사용 O: " + str);
    }
}
