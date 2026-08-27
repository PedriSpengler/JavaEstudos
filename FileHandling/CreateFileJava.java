import java.io.File;
import java.io.IOException;

public class CreateFileJava {
    public static void main(String[] args) {
        // Criando o arquivo
        try {
            File myObj = new File("FileHandling/Assets/filename.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }
    }
}

/*
Method 	Type 	Description
canRead() 	Boolean 	Tests whether the file is readable or not
canWrite() 	Boolean 	Tests whether the file is writable or not
createNewFile() 	Boolean 	Creates an empty file
delete() 	Boolean 	Deletes a file
exists() 	Boolean 	Tests whether the file exists
getName() 	String 	Returns the name of the file
getAbsolutePath() 	String 	Returns the absolute pathname of the file
length() 	Long 	Returns the size of the file in bytes
list() 	String[] 	Returns an array of the files in the directory
mkdir() 	Boolean 	Creates a directory
*/