
package Interface.newpackage;

//Create an interface called Shape with methods calculateArea() and calculatePerimeter(). 
//Implement this interface with classes Circle and Rectangle. Test the implementations.
public interface Shape {
    public void calculateArea();
    public void calculatePerimeter();
}
class Rectangle implements Shape{
 @Override
 public void calculateArea(){
     int l=20,b=30;
     double area=(l*b);
     System.out.println(" Rectangle Area =" +area);
 }
 @Override
 public void calculatePerimeter(){
     int l=20,b=30;
     double perimeter=2*(l+b);
     System.out.println("Rectangle Perimeter =" +perimeter);
 }
    public static void main(String[] args) {
        //Rectangle r=new Rectangle();
        //r.calculateArea();
        //r.calculatePerimeter();
    }

}
class Circle implements Shape {
 @Override
 public void calculateArea(){
     int r=30;
     double area=(3.14*r*r);
     System.out.println("Circle Area =" +area);
     
 }
 @Override
 public void calculatePerimeter(){
     int r=30;
     double perimeter=(2*3.14*r);
     System.out.println("Circle Perimeter =" +perimeter);
 }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea();
        c.calculatePerimeter();
        Rectangle r=new Rectangle();
        r.calculateArea();
        r.calculatePerimeter();
    }
    
}