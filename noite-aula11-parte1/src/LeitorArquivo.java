import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {

    public static void main(String[] args) {
        File f = new File("C:/temp/teste.txt");

        try {
            FileReader fr = new FileReader(f);
            int i = 0;
            while( (i = fr.read()) != -1 ) {
                System.out.print((char)i);
            }

            fr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}