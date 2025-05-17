package Practice5;


public class Fruit {
    String name;
    int fruitprice;
//    default constructor
    public Fruit(){
        this("apple",30);
//        this.name="apple";
//        this.fruitprice=30;
    }
//    parameterized constructor
    public Fruit(String name,int fruitprice){
        this.name=name;
        this.fruitprice=fruitprice;        
    }
    public Fruit(Fruit obj){
        this.name=obj.name;
        this.fruitprice=obj.fruitprice;
        
    }
    public static void main(String[] args) {
        Fruit f=new Fruit();
        Fruit f1=new Fruit(f);
        System.out.println(f1.name+f1.fruitprice);
                
    }
    
}
