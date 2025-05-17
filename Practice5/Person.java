
package Practice5;


public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
    }
    public static void main(String[] args){
        Person s=new Person("kavi",19);
        s.display();
    }
}
