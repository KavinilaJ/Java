
package Practice4;


public class tables {
   public static void main(String[] args){
       int i,multiple=2;
       int []num=new int[10];
       for(i=0;i<num.length;i++){
           num[i]=(i+1)*multiple;
           System.out.println((i+1)+"*"+multiple+"="+num[i]);
       } 
    }
}
