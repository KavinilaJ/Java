
package Practice5;


public class Circle1 {
    double area,perimeter;
     int radius;
    public Circle1(int radius){
        System.out.println("constructor is running");
        this.radius=radius;
        area = 3.14*radius*radius;
        System.out.println("Area is " +area);
    }
     
public static void main(String[] args){
   Circle1 c=new Circle1(10); 
  }
}