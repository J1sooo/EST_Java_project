package Chap7.overload;

public class HouseDog extends Dog {
    void sleep(int hour) {
        System.out.println(this.name + " Zzz... for " + hour);
    }
}
