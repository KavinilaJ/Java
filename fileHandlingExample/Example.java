
package fileHandlingExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");

        // Check if file exists
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created");
        } else {
            file.delete();
            System.out.println("File already exists. Deleted the file.");
            return; // Exit to avoid writing to a deleted file
        }

        // Write to the file
        FileWriter obj = new FileWriter(file);
        obj.write("java");
        obj.close();
        System.out.println("Data written to file");
    }
}








