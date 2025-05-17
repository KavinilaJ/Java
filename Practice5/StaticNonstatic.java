
package Practice5;


public class StaticNonstatic {
    int a=10;
    static int b=20;
    public void Method1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Method2(){
        //System.out.println(a);
        System.out.println(b);
    } 
        
    public static void main(String[] args){
       StaticNonstatic s=new StaticNonstatic();
       s.Method1();
       s.Method2();
       Method2();
    }
}
