
package Overriding;

class VehicleParent {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends VehicleParent {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleParent v = new VehicleParent();
        v.run();    // Vehicle is running

        Bike b = new Bike();
        b.run();    // Bike is running safely
    }
}
