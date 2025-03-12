package Chap8.polymorphism;

public class VehicleSample {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();
//
//        bus.run();
//        taxi.run();


        Driver driver = new Driver();
        driver.drive(bus);
    }
}
