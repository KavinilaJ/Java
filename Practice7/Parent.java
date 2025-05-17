
package Practice7;


public interface Parent {
   public void fun1(); 
}
interface Parent2{
    public void fun2();
}
class Child implements Parent,Parent2{

    @Override
    public void fun1() {
        System.out.println("Function from parent 1");
    }

    @Override
    public void fun2() {
        System.out.println("Function from parent 2");
    }
    
}
class Main{
    public static void main(String[] args) {
        Child c=new Child();
        c.fun1();
        c.fun2();
    }
}