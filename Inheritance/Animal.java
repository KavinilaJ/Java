package Inheritance;

class Sound {
    public void makesSound() {
        System.out.println("Starting the engine");
    }
}

class Dog extends Sound {
    @Override
    public void makesSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Sound {
    @Override
    public void makesSound() {
        System.out.println("Cat mews");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makesSound();
        cat.makesSound();
    }
}

