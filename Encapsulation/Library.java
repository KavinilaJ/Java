
package Encapsulation;


public class Library {
    private String title;
    private String author;
    private boolean status;
    public void setDetails(String title,String author){
        this.title=title;
        this.author=author;
        this.status=true;
    }
    public void borrowBook(){
        if(status){
            status=false;
            System.out.println("The book " +title+ " is borrowed");
        }
        else{
            System.out.println("The book " +title+ " is not available");
        }
    }
    public void returnBook(){
        if(status){
            System.out.println("The book " +title+ " is already in the library");
        }
        else{
            status=true;
            System.out.println("The book " +title+ " is returned");
        }
    }
    public void getDetails(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        if(status){
           System.out.println("Status : Available"); 
        }
        else{
           System.out.println("Status : Unavailable"); 
        }
    }
    public static void main(String[] args) {
        Library l=new Library();
        l.setDetails("Harry potter","J.K.Rowling");
        l.getDetails();
        l.borrowBook();
        l.borrowBook();
        //l.returnBook();
    }
}
