
package Encapsulation;


public class Employee {
    private String name;
    private int id;
    private int salary;
    public void setDetails(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void getDetails(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setDetails("nina",252,50000);
        e.getDetails();
    }
}
