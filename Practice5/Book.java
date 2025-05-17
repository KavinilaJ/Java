
package Practice5;


public class Book {
   // Extend the Book class from the previous example. Add a parameterized constructor that accepts 
   // title, author, pages, and price. Implement a default constructor that sets default values. 
   // Create an object using both constructors and display the book details.
    String title,author;
    int pages,price;
    public Book(String title,String author,int pages,int price ){
        this.author=author;
        this.title=title;
        this.pages=pages;
        this.price=price;
   }
    public Book(){
        author="Rowling";
        title="Harry potter";
        pages=1111;
        price=750;
    }
    public Book(Book obj){
        this.title=obj.title;
        this.author=obj.author;
        this.pages=obj.pages;
        this.price=obj.price;
        
    }
    public void add(int a){
        System.out.println(a);
                
    }
    public void display(){
        System.out.println("Author is "+author);
        System.out.println("Title is "+title);
        System.out.println("Number of pages is "+pages);
        System.out.println("Price is "+price);
    }
    public static void main(String[] args) {
//        int a=10;
//        Integer number=10;
        Book b=new Book();
        int number=20;
        b.add(number);
        Book a= new Book(new Book());
        a.title=b.title;
        b.display();
    }
    

}
