
package OopsPractice;


public class Sum {
    int x,y;
    Sum(int x, int y){
        System.out.println("Sum="+(x+y));
    }
    Sum(int x){
        y=10;
        System.out.println("Sum="+(x+y));
    }
    Sum(){
        x=10;
        y=20;
        System.out.println("Sum="+(x+y));
         }
    public static void main(String[] args) {
        Sum s1=new Sum(10,20);
        Sum s2=new Sum(10);
        Sum s3=new Sum();

    }
}
