
package Interface.newpackage;


 public class Bird implements Flyable,Swimmable{
    public void swim(){
        System.out.println("The bird can swim");
    }
    public void fly(){
        System.out.println("The bird can fly");
    }
    public static void main(String[] args) {
        Bird b=new Bird();
        b.fly();
        b.swim();
    }
}

