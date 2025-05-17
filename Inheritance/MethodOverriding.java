
package Inheritance;

class Rectangle {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int CalculateArea() {
        return length * breadth;
    }
}

class Circle extends Rectangle {
    private int radius;

    public Circle(int length, int breadth, int radius) {
        super(length, breadth);
        this.radius = radius;
    }

    @Override
    public int CalculateArea() {
        return (int)(3.14 * radius * radius);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 6);

        System.out.println("Circle Area: " + c.CalculateArea());
    }
}
