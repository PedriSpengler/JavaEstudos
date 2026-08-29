import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsJava {
    public static void main(String[] args) {

        // ========================================================
        // 1. VALIDAÇÃO DIRETA (matches)
        // Cenário: Validar formato de CPF simplificado (XXX.XXX.XXX-XX)
        // ========================================================
        String cpf = "123.456.789-00";
        // \\d{3} = 3 dígitos, \\. = ponto literal, $ = fim da linha
        String regexCpf = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";

        boolean cpfValido = cpf.matches(regexCpf);
        System.out.println("=== 1. VALIDAÇÃO ===");
        System.out.println("O CPF " + cpf + " é válido? " + cpfValido);
        System.out.println();


        // ========================================================
        // 2. EXTRAÇÃO COM GRUPOS CAPTURADOS (Matcher.find() e matcher.group())
        // Cenário: Extrair data e itens com preços de um log de compras
        // ========================================================
        String logTexto = "Pedido realizado em 28/08/2026. "
                + "Itens: Teclado (R$ 150), Mouse (R$ 80), Monitor (R$ 1200).";

        // Grupo 1: Nome do produto ([A-Za-zÀ-ÿ]+)
        // Grupo 2: Valor numérico (\\d+)
        Pattern patternItem = Pattern.compile("([A-Za-zÀ-ÿ]+) \\(R\\$ (\\d+)\\)");
        Matcher matcherItem = patternItem.matcher(logTexto);

        System.out.println("=== 2. EXTRAÇÃO E GRUPOS ===");
        while (matcherItem.find()) {
            // group(0) é o casamento completo; group(1) e group(2) são os parênteses
            String produto = matcherItem.group(1);
            String preco = matcherItem.group(2);
            System.out.println("Produto: " + produto + " | Preço: R$ " + preco);
        }
        System.out.println();


        // ========================================================
        // 3. BUSCA COM FLAGS (Pattern.CASE_INSENSITIVE)
        // Cenário: Encontrar menções a linguagens ignorando maiúsculas/minúsculas
        // ========================================================
        String textoLinguagens = "Estou aprendendo JAVA, mas também gosto de java e Java Web.";
        Pattern patternJava = Pattern.compile("\\bjava\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcherJava = patternJava.matcher(textoLinguagens);

        int ocorrencias = 0;
        while (matcherJava.find()) {
            ocorrencias++;
        }
        System.out.println("=== 3. FLAGS ===");
        System.out.println("Ocorrências da palavra 'Java': " + ocorrencias);
        System.out.println();


        // ========================================================
        // 4. SUBSTITUIÇÃO E FORMATAÇÃO (replaceAll)
        // Cenário: Mascarar e-mails para privacidade
        // ========================================================
        String textoEmails = "Contate suporte@empresa.com ou financeiro@empresa.com.";
        // Substitui o nome do usuário antes do '@' por '***'
        String emailsMascarados = textoEmails.replaceAll("[a-zA-Z0-9._%+-]+(?=@)", "***");

        System.out.println("=== 4. SUBSTITUIÇÃO ===");
        System.out.println("Texto original: " + textoEmails);
        System.out.println("Texto mascarado: " + emailsMascarados);
    }
}