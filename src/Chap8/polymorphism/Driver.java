package Chap8.polymorphism;

public class Driver {
    void drive(Vehicle vehicle) {
        // instanceof
        if (vehicle instanceof Bus) {
            System.out.println("//bus");
        } else if (vehicle instanceof Taxi) {
            System.out.println("//Taxi");
        }
        vehicle.run();
    }
}
