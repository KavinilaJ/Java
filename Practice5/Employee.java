
package Practice5;


public class Employee {
    String name;
    int age;
    Employee() {
        name = "John Doe";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }


}
