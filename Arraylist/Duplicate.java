
package Arraylist;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> org = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();

        org.add(10);
        org.add(20);
        org.add(30);
        org.add(10);

        ArrayList<Integer> seen = new ArrayList<>();

        for (int num : org) {
            if (seen.contains(num) && !dup.contains(num)) {
                dup.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println(org);
        System.out.println(dup);
    }
}
