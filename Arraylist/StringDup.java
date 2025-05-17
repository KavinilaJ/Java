
package Arraylist;

import java.util.ArrayList;


public class StringDup {
    public static void main(String[] args) {
    ArrayList<String> orgStr=new ArrayList();
    ArrayList<String> dupStr=new ArrayList();
    orgStr.add("apple");
    orgStr.add("apple");
    orgStr.add("orange");
    orgStr.add("watermelon");
    for(String num:orgStr){
        if(!dupStr.contains(num)){
            dupStr.add(num);
        }
    }
    System.out.println(orgStr);
    System.out.println(dupStr);
}
}

