
package ExceptionHandling;

public class ArraryException {
 public static void main(String[] args) {
   try{
    int[] arr=new int[5];
    int n=arr[8];
    }
    catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
}
}
}
