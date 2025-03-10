package Chap6.gettersetter;

public class Sonata {
    private int speed;
    private boolean stop;

    public void setSpeed(int speed){
//        this.speed = speed<0 ? 0 : speed;
        this.speed = Math.max(speed, 0);
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public static void main(String[] args) {
        Sonata sonata = new Sonata();
        sonata.setSpeed(-20);
        System.out.println(sonata.speed);

        sonata.setSpeed(50);
        System.out.println(sonata.speed);

        if (!sonata.isStop()) {
            sonata.setStop(true);
        }
        System.out.println("멈춘 후: "+sonata.speed);
    }
}
