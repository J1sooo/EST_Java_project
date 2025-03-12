package Chap8.defaultmethod;

public class Zoo {

    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();

        Tiger2 tiger = new Tiger2();
        zookeeper.feed(tiger);

        Lion2 lion = new Lion2();
        zookeeper.feed(lion);
    }
}

class Zookeeper2 {
    void feed(Predator predator) {
        predator.printFood();
    }
}

class Tiger2 implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion2 implements Predator {
    @Override
    public String getFood() {
        return "fish";
    }
}
