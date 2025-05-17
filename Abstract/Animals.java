
package Abstract;

//Define an abstract class Animal with an abstract method makeSound(). 
//Create concrete classes Dog and Cat that extend the Animal class. 
//Implement the makeSound() method to print a sound for each animal
public abstract class Animals {
    public abstract void makesSound();
}
class dog extends Animals{
    @Override
    public void makesSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animals{
    @Override
    public void makesSound(){
        System.out.println("Cat Mews");
    }
    public static void main(String[] args) {
        Cat c=new Cat();
        c.makesSound();
        dog d=new dog();
        d.makesSound();
    }
}