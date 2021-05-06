import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClienteSocket {
    public static void main(String[] args) {
        try {
            System.out.println("Cliente executado");
            Socket servidor = new Socket("localhost", 8000);
            System.out.println("Conectado no servidor");
            OutputStream out = servidor.getOutputStream();
//            out.write("Cliente Java conectado no servidor".getBytes());
//            out.flush();

//            Console console = System.console();
//            if (console == null) {
//                System.err.println("No console.");
//                System.exit(1);
//            }

            InputStream in = servidor.getInputStream();
//            InputStreamReader inr = new InputStreamReader(in);
//            BufferedReader brServidor = new BufferedReader(inr);

//            InputStreamReader inrTeclado = new InputStreamReader(System.in);
//            BufferedReader brTeclado = new BufferedReader(inrTeclado);
            Scanner scan = new Scanner(System.in);

            int a = 0;
            while (a < 1000) {
                if (in.available() > 0) {
                    System.out.print((char)in.read());
                }

//                if (brTeclado.ready()) {
//                    out.write(brTeclado.readLine().getBytes());
//                    out.flush();
//                }
//                String linha = console.readLine();
//                out.write(linha.getBytes());
//                if (scan.hasNextLine()) {
//                    out.write(scan.nextLine().getBytes());
//                    out.flush();
//                }
                if (System.in.available() > 0) {
                    int i = System.in.read();
                    // String linha = scan.nextLine();
                    // System.out.print((char)i);
                    // out.write(linha.getBytes());
                    out.write(i);
                    out.flush();
                }
            }

            servidor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}