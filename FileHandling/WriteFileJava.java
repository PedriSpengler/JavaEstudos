import java.io.FileWriter;
import java.io.IOException;

public class WriteFileJava {
    public static void main(String[] args) {
        // Escrever no arquivo
        try {
            FileWriter myWriter = new FileWriter("FileHandling/Assets/filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
