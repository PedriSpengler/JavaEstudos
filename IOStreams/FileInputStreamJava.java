import java.io.FileInputStream;  // Import FileInputStream
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamJava {
        public static void main(String[] args) {
            // try-with-resources: FileInputStream will be closed automatically
            try (FileInputStream input = new FileInputStream("IOStreams/Assets/texto.txt")) {

                int i;  // variable to store each byte that is read

                // Read one byte at a time until end of file (-1 means "no more data")
                while ((i = input.read()) != -1) {
                    // Convert the byte to a character and print it to the console
                    System.out.print((char) i);
                }

            } catch (IOException e) {
                // If an error happens (e.g. file not found), print an error message
                System.out.println("Error reading file.");
            }

            try (FileInputStream input = new FileInputStream("IOStreams/Assets/image.jpg");
                 FileOutputStream output = new FileOutputStream("IOStreams/Assets/copy.jpg")) {

                int i;
                while ((i = input.read()) != -1) {
                    output.write(i);  // write the raw byte to the new file
                }

                System.out.println("File copied successfully.");

            } catch (IOException e) {
                System.out.println("Error handling file.");
            }

    }
}
