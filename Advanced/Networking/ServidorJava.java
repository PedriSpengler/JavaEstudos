package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorJava {
    public static void main(String[] args) {
        int porta = 12345;

        // Try-with-resources garante o fechamento automático dos recursos
        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexoes na porta " + porta + "...");

            // Bloqueia a execucao ate que um cliente se conecte
            try (Socket socketCliente = serverSocket.accept()) {
                System.out.println("Cliente conectado: " + socketCliente.getInetAddress());

                // Leitor para receber mensagens do cliente
                BufferedReader entrada = new BufferedReader(
                        new InputStreamReader(socketCliente.getInputStream())
                );

                // Escritor para enviar mensagens ao cliente
                PrintWriter saida = new PrintWriter(socketCliente.getOutputStream(), true);

                // Le a mensagem enviada pelo cliente
                String mensagemRecebida = entrada.readLine();
                System.out.println("Recebido do cliente: " + mensagemRecebida);

                // Envia uma resposta
                saida.println("Ola! Mensagem recebida com sucesso: '" + mensagemRecebida + "'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
