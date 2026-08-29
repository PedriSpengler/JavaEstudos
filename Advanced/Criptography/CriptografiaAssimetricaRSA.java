// Declara o pacote ao qual a classe pertence (organização lógica de pastas no projeto)
package Criptography;

// Importa a classe central do JCE responsável pelas operações de cifragem e decifragem
import javax.crypto.Cipher;
// Importa o conjunto padrão de codificações de texto (usado para garantir UTF-8)
import java.nio.charset.StandardCharsets;
// Importa o contêiner que agrupa o par de chaves relacionadas (pública e privada)
import java.security.KeyPair;
// Importa o gerador de pares de chaves assimétricas específicas para algoritmos como o RSA
import java.security.KeyPairGenerator;
// Importa a interface que representa a chave privada (usada para decifrar ou assinar)
import java.security.PrivateKey;
// Importa a interface que representa a chave pública (usada para cifrar ou verificar)
import java.security.PublicKey;
// Importa a classe utilitária para codificação e decodificação em formato Base64
import java.util.Base64;

// Declaração da classe pública para demonstração de criptografia assimétrica RSA
public class CriptografiaAssimetricaRSA {
    // Método de entrada principal da aplicação onde o fluxo de execução ocorre
    public static void main(String[] args) throws Exception {
        // --- 1. GERAÇÃO DO PAR DE CHAVES ASSIMÉTRICAS (RSA) ---
        // Obtém uma instância do gerador de chaves configurada especificamente para o algoritmo "RSA"
        KeyPairGenerator geradorChaves = KeyPairGenerator.getInstance("RSA");
        // Define o tamanho da chave em 2048 bits (padrão de mercado atual contra ataques de fatoração)
        geradorChaves.initialize(2048);
        // Gera matematicamente o par de chaves acopladas (uma chave pública e uma privada)
        KeyPair par = geradorChaves.generateKeyPair();
        // Extrai a chave pública do par (pode ser compartilhada abertamente com terceiros)
        PublicKey chavePublica = par.getPublic();
        // Extrai a chave privada do par (deve ser mantida em sigilo absoluto pelo dono)
        PrivateKey chavePrivada = par.getPrivate();

        // Texto em claro contendo a informação confidencial a ser protegida
        String mensagem = "Token de autenticação ou chave de sessão";

        // --- 2. CIFRAGEM (ENCRIPTAÇÃO COM CHAVE PÚBLICA) ---
        // Instancia o Cipher com RSA, modo ECB e esquema de preenchimento seguro OAEP com SHA-256
        Cipher cipherCifrar = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        // Inicializa o Cipher em modo de encriptação passando a Chave Pública do destinatário
        cipherCifrar.init(Cipher.ENCRYPT_MODE, chavePublica);
        // Converte a string em bytes UTF-8 e executa o cálculo criptográfico gerando os bytes cifrados
        byte[] bytesCifrados = cipherCifrar.doFinal(mensagem.getBytes(StandardCharsets.UTF_8));

        // --- 3. DECIFRAGEM (DESENCRIPTAÇÃO COM CHAVE PRIVADA) ---
        // Instancia outro Cipher com a exata mesma especificação de algoritmo, modo e preenchimento OAEP
        Cipher cipherDecifrar = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        // Inicializa o Cipher em modo de decriptação passando a Chave Privada correspondente
        cipherDecifrar.init(Cipher.DECRYPT_MODE, chavePrivada);
        // Executa a operação inversa sobre os bytes cifrados para restaurar os dados originais
        byte[] bytesDecifrados = cipherDecifrar.doFinal(bytesCifrados);

        // Converte os bytes decifrados de volta para String UTF-8 e imprime a mensagem recuperada no console
        System.out.println("Decifrado: " + new String(bytesDecifrados, StandardCharsets.UTF_8));
    }
}