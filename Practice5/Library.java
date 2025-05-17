
package Practice5;

public class Library {
    public Library(){
        System.out.println("Library constructor is running");
    }
    public Library(int num,String name){
        System.out.println("Name of the library :" +name);
        System.out.println("Number of books :" +num);
    }
    public Library(String Addr){
        System.out.println("Address of library :" +Addr);
    }
    public Library(int pin){
        System.out.println("Pincode of library :" +pin);
    }
    public static void main(String[] args){
        Library l1=new Library();
        Library l2=new Library(3333,"Roman Rollan");
        Library l3=new Library("Puducherry");
        Library l4=new Library(605013);
    }
}
