
package Practice5;

public class StudentMethod {
    String name="Nina";
    int id=123456;
    static int age=19;
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id  : "+id);
        System.out.println("Age : "+age);
    }
    public static void Vote(){
        if(age>18){
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args){
        StudentMethod s=new StudentMethod();
        s.display();
        Vote();
    }
}
