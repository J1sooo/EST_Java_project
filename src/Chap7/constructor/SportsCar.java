package Chap7.constructor;

/*
1. 매개변수가 없는 생성자 호출
2. 부모 클래스에 매개변수가 있는 생성자 생성 -> 오류
3.    -> 부모의 default 생성자가 사라짐 super();
*/

public class SportsCar extends Car {
    SportsCar(String name) {
        super(name);
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("porsche");
    }
}
