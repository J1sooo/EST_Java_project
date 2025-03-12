package Chap8.zoo;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);

        Lion lion = new Lion();
        zookeeper.feed(lion);
    }
}

class Zookeeper {
    void feed(Tiger tiger) {
        System.out.println("feed meat");
    }

    void feed(Lion lion) {
        System.out.println("feed fish");
    }
}

class Tiger {

}

class Lion {

}