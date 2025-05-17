package Overriding;

class ShapeParent {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends ShapeParent {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Shape {
    public static void main(String[] args) {
        ShapeParent s = new ShapeParent();
        s.draw();    // Drawing shape

        Circle c = new Circle();
        c.draw();    // Drawing circle
    }
}
