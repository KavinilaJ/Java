
package Encapsulation;


public class Student {
    private String name;
    private int age;
    private char grade;
    public void setDetails(String name,int age,char grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public void getDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Grade:"+grade);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.setDetails("Nina",19,'A');
        s.getDetails();
    }
}
