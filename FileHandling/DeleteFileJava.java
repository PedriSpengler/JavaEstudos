import java.io.File;

public class DeleteFileJava {
    public static void main(String[] args) {
        File myObj = new File("FileHandling/Assets/filename.txt");
        // Deletar um arquivo
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
