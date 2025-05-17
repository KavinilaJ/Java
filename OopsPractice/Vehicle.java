
package OopsPractice;



class Vehicle {
    protected String type;
    protected double rentPerDay;

    public Vehicle(String type, double rentPerDay) {
        this.type = type;
        this.rentPerDay = rentPerDay;
    }

    public double calculateRentalCost(int days) {
        return rentPerDay * days;
    }
}

class Car extends Vehicle {
    private int numSeats;

    public Car(int numSeats, double rentPerDay) {
        super("Car", rentPerDay);
        this.numSeats = numSeats;
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 50);
        double totalCost = car.calculateRentalCost(7);
        System.out.println("Total rental cost for the car: $" + totalCost);
    }
}
