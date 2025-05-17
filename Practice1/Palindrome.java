
package Practice1;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}




