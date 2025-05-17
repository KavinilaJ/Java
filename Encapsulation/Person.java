
package Encapsulation;


public class Person {
    private String name;
    private int age;
    private char address;
    public void setName(String name){
        this.name=name;
       }
    public void getName(){
        System.out.println("Name:"+name);
      }
    public void setAge(int age){
        this.age=age;
       }
    public void getAge(){
        System.out.println("Age:"+age);
      }
    public static void main(String[] args) {
        Person s=new Person();
        s.setName("Nina");
        s.getName();
    }
}
