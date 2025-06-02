

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true for append mode
            writer.write("\nAppended line: Keep learning Java!");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
