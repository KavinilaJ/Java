
package Practice7;


public interface Vehicle {
   abstract public void speed();
}
class TwoWheeler implements Vehicle{
    public void speed(){
        System.out.println("Two Wheeler runs at the speed of 60 km per hour");
    }
}
class Car implements Vehicle{
    public void speed(){
        System.out.println("Car runs at the speed of 100 km per hour");                
    }
}
class main{
    public static void main(String[] args) {
        Car c=new Car();
        c.speed();
        TwoWheeler t=new TwoWheeler();
        t.speed();
    }
}
    