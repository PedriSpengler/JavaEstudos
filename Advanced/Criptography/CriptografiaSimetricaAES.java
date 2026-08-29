// Declara o pacote ao qual a classe pertence (organização lógica de diretórios)
package Criptography;

// Importa a classe responsável pelas operações criptográficas (cifrar e decifrar)
import javax.crypto.Cipher;
// Importa o gerador de chaves simétricas (como chaves AES)
import javax.crypto.KeyGenerator;
// Importa a interface que representa uma chave secreta/simétrica na memória
import javax.crypto.SecretKey;
// Importa a especificação de parâmetros necessária para o modo de operação GCM (IV e tamanho da Tag)
import javax.crypto.spec.GCMParameterSpec;
// Importa a definição de conjuntos de caracteres padrão (usado para UTF-8)
import java.nio.charset.StandardCharsets;
// Importa o gerador de números pseudoaleatórios criptograficamente seguro
import java.security.SecureRandom;
// Importa a classe utilitária para codificação e decodificação em Base64
import java.util.Base64;

// Declaração da classe pública executável
public class CriptografiaSimetricaAES {
    // Define o tamanho da chave AES em bits (256 bits = maior nível de segurança suportado pelo AES)
    private static final int TAMANHO_CHAVE_AES = 256;
    // Define o tamanho do IV em bytes (12 bytes / 96 bits é o tamanho ótimo recomendado para o algoritmo GCM)
    private static final int TAMANHO_IV_GCM = 12;
    // Define o tamanho da tag de autenticação em bits (128 bits garante a integridade máxima do bloco)
    private static final int TAMANHO_TAG_GCM = 128;

    // Metodo principal onde o fluxo de execução do programa se inicia
    public static void main(String[] args) throws Exception {
        // --- 1. GERAÇÃO DA CHAVE AES ---
        // Obtém uma instância do gerador de chaves configurado para o algoritmo "AES"
        KeyGenerator geradorChave = KeyGenerator.getInstance("AES");
        // Inicializa o gerador configurando o tamanho da chave para 256 bits
        geradorChave.init(TAMANHO_CHAVE_AES);
        // Gera efetivamente a chave simétrica aleatória de 256 bits
        SecretKey chaveSecreta = geradorChave.generateKey();

        // --- 2. GERAÇÃO DO VETOR DE INICIALIZAÇÃO (IV) ---
        // Cria um array de bytes vazio com tamanho de 12 bytes para armazenar o IV
        byte[] iv = new byte[TAMANHO_IV_GCM];
        // Instancia o gerador de números aleatórios de alta entropia/segurança
        SecureRandom random = new SecureRandom();
        // Preenche o array de bytes do IV com valores binários aleatórios e imprevisíveis
        random.nextBytes(iv);

        // String de texto simples que será protegida pela criptografia
        String mensagemOriginal = "Dados confidenciais em texto plano";

        // --- 3. CIFRAGEM (ENCRIPTAÇÃO) ---
        // Solicita ao JCE a implementação do AES no modo GCM sem preenchimento de bloco (NoPadding)
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        // Cria a especificação de parâmetros combinando a tag de integridade (128 bits) com o IV gerado
        GCMParameterSpec specParametros = new GCMParameterSpec(TAMANHO_TAG_GCM, iv);
        // Inicializa o objeto Cipher em modo de cifragem, passando a chave AES e os parâmetros GCM
        cipher.init(Cipher.ENCRYPT_MODE, chaveSecreta, specParametros);
        // Converte o texto plano em bytes UTF-8 e executa a cifragem, gerando o ciphertext autenticado
        byte[] textoCifrado = cipher.doFinal(mensagemOriginal.getBytes(StandardCharsets.UTF_8));

        // Converte o array de bytes cifrados (binário) para texto legível em formato Base64
        String cifradoBase64 = Base64.getEncoder().encodeToString(textoCifrado);
        // Imprime a string cifrada em Base64 no console
        System.out.println("Cifrado (Base64): " + cifradoBase64);

        // --- 4. DECIFRAGEM (DESENCRIPTAÇÃO) ---
        // Reinicializa o mesmo Cipher em modo de decifragem com a mesma chave e mesmos parâmetros (IV e Tag)
        cipher.init(Cipher.DECRYPT_MODE, chaveSecreta, specParametros);
        // Converte o texto Base64 de volta para bytes binários e executa a decifragem validando a tag
        byte[] bytesDecifrados = cipher.doFinal(Base64.getDecoder().decode(cifradoBase64));
        // Converte o array de bytes decifrados de volta em uma String com codificação UTF-8
        String mensagemDecifrada = new String(bytesDecifrados, StandardCharsets.UTF_8);

        // Imprime a mensagem original recuperada no console
        System.out.println("Decifrado: " + mensagemDecifrada);
    }
}