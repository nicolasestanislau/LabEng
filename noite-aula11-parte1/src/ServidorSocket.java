import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServidorSocket {
    public static void main(String[] args) {
        try {
            System.err.println("Sistema Servidor Socket");
            ServerSocket server = new ServerSocket(8000);
            System.err.println("Servidor ativo - aguardando conexão do cliente");
            Socket cliente = server.accept();
            OutputStream out = cliente.getOutputStream();
            out.write("Ola cliente aqui é o servidor Java".getBytes());
            InputStream in = cliente.getInputStream();
            int a = 0;
            while (a < 1000) {
               if (in.available() > 0) {
                   int i = 0;
                   while ((i = in.read()) != -1) {
                       System.out.print((char)i);
                   }
               }
            }
            System.out.println("Cliente conectado");
            server.close();
            System.err.println("Servidor Fechado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}