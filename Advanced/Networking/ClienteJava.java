package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteJava {
    public static void main(String[] args) {
        String host = "127.0.0.1"; // localhost
        int porta = 12345;

        try (Socket socket = new Socket(host, porta)) {
            // Canal de saida (envia dados para o servidor)
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);

            // Canal de entrada (recebe dados do servidor)
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            // Envia uma mensagem de texto
            saida.println("Ola, servidor! Sou o cliente Java.");

            // Le a resposta do servidor
            String resposta = entrada.readLine();
            System.out.println("Resposta do servidor: " + resposta);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
