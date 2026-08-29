// Declara o pacote ao qual a classe pertence (organização lógica de pastas no projeto)
package Criptography;

// Importa o conjunto padrão de codificações de texto (usado para converter String em bytes UTF-8)
import java.nio.charset.StandardCharsets;
// Importa a classe do Java responsável por fornecer algoritmos de resumo criptográfico (funções hash)
import java.security.MessageDigest;
// Importa a classe utilitária para manipulação e formatação de arrays em texto
import java.util.Arrays;

// Declaração da classe pública para demonstração de cálculo de hash criptográfico
public class Hashing {
    // Método principal onde a execução do programa começa
    public static void main(String[] args) throws Exception {
        // String de entrada cujo conteúdo terá a integridade/resumo calculada
        String texto = "Validar integridade de arquivo ou mensagem";

        // Obtém uma instância do algoritmo de hash seguro SHA-256 (gera saída fixa de 256 bits / 32 bytes)
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        // Converte o texto para bytes UTF-8 e executa o cálculo de hash unidirecional
        byte[] hash = digest.digest(texto.getBytes(StandardCharsets.UTF_8));
        // Imprime a representação numérica decimal de cada byte do array gerado
        System.out.println("Hash (bytes): " + Arrays.toString(hash));

        // Cria um buffer de strings mutável e eficiente para montar o texto hexadecimal final
        StringBuilder hexString = new StringBuilder();
        // Itera sobre cada byte individual do array de hash gerado
        for (byte b : hash) {
            // Aplica máscara binária 0xff para tratar o byte como unsigned (0 a 255) e converte para hexadecimal
            String hex = Integer.toHexString(0xff & b);
            // Se o valor tiver apenas 1 caractere (0 a 15), insere o '0' à esquerda para manter 2 dígitos por byte
            if (hex.length() == 1) hexString.append('0');
            // Anexa o valor hexadecimal atual ao buffer final
            hexString.append(hex);
        }

        // Imprime a string final com os 64 caracteres hexadecimais correspondentes aos 32 bytes do SHA-256
        System.out.println("Hash SHA-256: " + hexString.toString());
    }
}