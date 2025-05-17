
package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ListIteratorExample {
    public static void main(String[] args) {
           ArrayList<Integer> num=new ArrayList<>();
           num.add(10);
           num.add(20);
           num.add(30);
           ListIterator<Integer> n=num.listIterator();
           while(n.hasNext()){
               System.out.println(n.next());
           }
    }
}
