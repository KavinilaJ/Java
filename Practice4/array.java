
package Practice4;


public class array {
    public static void main(String[] args) {
        int number;//variable declaration
        
        int []numbers;// array declaration
//        int number[];
//int[] numbers;
numbers=new int[10];//instantiation

//int [] numbers=new int[10]
numbers[0]=10;//initialization
numbers[1]=23;
for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
}
int arrayNumbers[]={20,30,40,50,68};//declaration, instantiation and initialization
System.out.println(arrayNumbers.length);
for (int i=0;i<arrayNumbers.length;i++){
    System.out.println(arrayNumbers[i]);
}
    }
}
