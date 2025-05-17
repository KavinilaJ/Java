
package Arraylist;
import java.util.*;

public class Creating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        obj.add(n);
        obj.add(m);
        obj.add(l);
        System.out.println(obj.size());
        int sum=0;
        for(int e:obj){
            sum+=e;
        }
        System.out.println(sum);
    }
}
