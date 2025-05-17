
package Practice7;


public class Encapsulation {
    private int age;
    private String name;
    public void SetName(String name){
        this.name=name;
    }
    public void SetAge(int age){
        this.age=age;
    }
    public void GetAge(){
        System.out.println(age);
    }
    public void GetName(){
        System.out.println(name);
    }
}
class maincl{
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.SetAge(19);
        e.SetName("Nina");
        e.GetName();
        e.GetAge();
    }
}
