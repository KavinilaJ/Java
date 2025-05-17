
package Practice5;

public class Circle {
     double area,perimeter;
     int radius;
    public Circle(int radius){
        System.out.println("constructor is running");
        this.radius=radius;
    }
     public double getArea(){
         area = 3.14*radius*radius;
         return area;
     }
     public double getPerimeter(){
         perimeter=2*3.14*radius;
         return perimeter;
     }
 public static void main(String[] args){
     Circle c=new Circle(10);
     Circle s=new Circle(20);
     System.out.println("Area of the circle is " +c.getArea());
     System.out.println("Perimeter of the circle " +c.getPerimeter());      
     Book a =new Book();
     a.display();
 }
         
}
