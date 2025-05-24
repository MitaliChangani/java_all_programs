import java.io.*;
public class TeaxtFileReadDemo {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        try {
            // Create a FileReader and BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);  // Print each line
            }
            
            // Close the reader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
