
package OopsPractice;


public class Multilevel {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Animalsound();
        d.Mammalsound();
        d.Dogsound();
    }
}
class Animal{
    public void Animalsound(){
        System.out.println("Animals make sound");
    }
}
class Mammal extends Animal{
    public void Mammalsound(){
        System.out.println("Mammals make sound");
    }
}
class Dog extends Mammal{
    public void Dogsound(){
        System.out.println("Dog barks");
    }
}