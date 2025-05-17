
package Practice3;

import java.util.Scanner;

public class IsArmstrong {
 public static boolean isArmstrong(int number) {
   int sum = 0;
   int temp = number;
   int numDigits = String.valueOf(number).length();
   while (temp != 0) {
       int digit = temp % 10;
        sum += Math.pow(digit, numDigits);
        temp /= 10;
    }
    return sum == number;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter end range: ");
        int endRange = scanner.nextInt();

        System.out.println("Armstrong numbers within the range:");
        for (int i = startRange; i <= endRange; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}


