
package Inheritance;
class Veh{
    public void startEngine(){
        System.out.println("Starting the engine");
    }
}
class Car extends Veh{
    @Override
    public void startEngine(){
        System.out.println("Car engine");
    }
}
class Motorcycle extends Veh{
    
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine");
    
}
}
public class Vehicle {
    public static void main(String[] args){
        Car c =new Car();
        Motorcycle m =new Motorcycle();
        c.startEngine();
        m.startEngine();
    }
}


