package Chap8.defaultmethod;

interface Predator {
    String getFood();

    // 디폴트 메서드
    default void printFood() {
        System.out.println("feed meat" + getFood());
    }

}
