
package Practice1;


abstract class Shape {
    public double area;

    public abstract void calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius; 
        System.out.println("Area of circle: " + area);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}


