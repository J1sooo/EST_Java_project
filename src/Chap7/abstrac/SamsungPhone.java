package Chap7.abstrac;

public class SamsungPhone extends Phone {

    public SamsungPhone(String owner) {
        super(owner);
    }

    @Override
    public void turnOff() {
        System.out.println("samsung 폰을 끕니다.");
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }

    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone("홍길동");
        samsung.turnOn();
        samsung.turnOff();
    }
}
