
package Practice4;


public class Student {
     int mark1=99,mark2=88,avg;
     
    public void MarkDetails(){
        avg=(mark1+mark2)/2;
        //int mark=99,mark2=88;
       // avg=(mark1+mark2)/2;
        System.out.println("Average mark is " +avg);
     }
    public  void Grade(){
        if(avg>90){
            System.out.println("Grade S");
        }
        else if(avg<=80&&avg>70){
            System.out.println("Grade A");
        }
        else if(avg<=70&&avg>60){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
    }
        public static void Result(){
            System.out.println("Result is found");
        }
    
 
    public static void main(String[] args){
        Student s =new Student();
        s.MarkDetails();
        s.Grade();
        Result();
        
    }
}
