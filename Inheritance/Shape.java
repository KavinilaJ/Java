
package Inheritance;

class ShapesMain{
    public void calculateAreas(){
        System.out.println("Calculating area");
    }
}
    
class Circles extends ShapesMain{
    int radius;
    public Circles(int radius){
        this.radius=radius;
    }
    @Override
    public void calculateAreas(){
        System.out.println("Area of circle is " +Math.PI*radius*radius);
    }
}
class Rectangles extends ShapesMain{
    int length,breadth;
    public Rectangles(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void calculateAreas(){
        System.out.println("Area of Rectangle is " +length*breadth);
    }
}
public class Shape{
     public static void main(String[] args){
            Circles circle =new Circles(4);
            circle.calculateAreas();
            Rectangles r=new Rectangles(4,5);
            r.calculateAreas();
      }
} 