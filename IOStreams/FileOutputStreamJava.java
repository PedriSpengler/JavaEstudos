import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamJava {
    public static void main(String[] args) {
        String text = "Testando output!";

        try(FileOutputStream output = new FileOutputStream("Assets/IOStreams/testeOutput.txt")){
            output.write(text.getBytes());
            System.out.println("Sucesso em escrever no arquivo");
        } catch (IOException e) {
            System.out.println("Erro em escrever no arquivo");
            e.printStackTrace();
        }

        // Copy image.jpg into copy.jpg
        try (FileInputStream input = new FileInputStream("Assets/image.jpg");
             FileOutputStream output = new FileOutputStream("Assets/copy.jpg")) {

            int b;
            while ((b = input.read()) != -1) {
                output.write(b);  // write each raw byte to the new file
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }

        // Por padrão, FileOutputStream Sobrescreve o arquivo se ele já existir. Para adicionar (acrescentar) novo conteúdo, passe truecomo segundo argumento:
        String textNew = "\nAppended text!";

        // true = append mode (keeps existing content)
        try (FileOutputStream output = new FileOutputStream("Assets/IOStreams/texto.txt", true)) {
            output.write(textNew.getBytes());
            System.out.println("Successfully appended to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
