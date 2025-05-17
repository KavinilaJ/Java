
package Practice4;

public class fibonacci {
    public static void main(String args[]){
      int t1=0,t2=1,t3,end=6;
        System.out.println(t1+"\n"+ t2);
        
      for(int i=2;i<end;i++){
          t3=t1+t2;
          System.out.println(t3);
          t1=t2;
          t2=t3;
      }
    }
}
