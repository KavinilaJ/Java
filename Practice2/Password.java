
package Practice2;

import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        
        do {
            System.out.print("Enter your password (at least 8 characters): ");
            password = scanner.nextLine();
        } while (password.length() < 8);
        
        System.out.println("Password set successfully.");
    }
}


