
package Overriding;

class AnimalParent {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends AnimalParent {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        AnimalParent a = new AnimalParent();
        a.sound();   // Output: Animal makes a sound

        Dog d = new Dog();
        d.sound();   // Output: Dog barks

        // Polymorphism: reference of superclass, object of subclass
        AnimalParent a2 = new Dog();
        a2.sound();  // Output: Dog barks
    }
}

