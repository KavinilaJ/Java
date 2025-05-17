
package Practice1;


public class Person {
    private String name;
    private int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.display(); 
        person.name="John"; 
        person.age=30; 
        System.out.println("Name: " + person.name); 
        System.out.println("Age: " +person.age); 
    }
}
 

