
package Practice4;


public class arrayStoring {
   public static void main(String[] args) {
       int array[]={1,2,3,4,5,6,7,8,9,10};
       int [] multiple=new int[10];
       for(int i=0;i<multiple.length;i++){
           multiple[i]=(i+1)*10;
           System.out.println(multiple[i]);
       }
   }
}
