
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            Scanner reader = new Scanner(file);

            int wordCount = 0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.split("\\s+"); // split on spaces/tabs
                wordCount += words.length;
            }

            reader.close();
            System.out.println("Total number of words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
