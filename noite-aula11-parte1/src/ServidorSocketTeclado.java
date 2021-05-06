import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocketTeclado {
    public static void main(String[] args) {
        try {
            System.err.println("Sistema Servidor Socket");
            ServerSocket server = new ServerSocket(8000);
            System.err.println("Servidor ativo - aguardando conexão do cliente");
            Socket cliente = server.accept();
            OutputStream out = cliente.getOutputStream();
            out.write("Ola cliente aqui é o servidor Java".getBytes());
            out.flush();

            InputStream in = cliente.getInputStream();
            InputStreamReader inr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(inr);

            InputStreamReader inrTeclado = new InputStreamReader(System.in);
            BufferedReader brTeclado = new BufferedReader(inrTeclado);

            int a = 0;
            while (a < 1000) {
                if (brTeclado.ready()) {
                    String linha = brTeclado.readLine();
                    out.write(linha.getBytes());
                }
//                if (in.available() > 0) {
//                   System.out.print((char)in.read());
//                }
                if (br.ready()) {
                    String comando = br.readLine();
                    System.out.println(comando);
                    if (!comando.equals("sair")) {
                        Runtime.getRuntime().exec(comando);
                    } else {
                        break;
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