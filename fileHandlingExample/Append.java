
package fileHandlingExample;
import java.io.FileWriter;
import java.io.IOException;

public class Append {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("text.txt", true); // true enables append mode
            writer.write("\nThis is appended text.");
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending.");
        }
    }
}
