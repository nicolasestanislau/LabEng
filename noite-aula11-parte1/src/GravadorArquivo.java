import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravadorArquivo {

    public static void main(String[] args) {

        File f = new File("C:/temp/teste.txt");

        try {
            FileWriter fw = new FileWriter( f );

            fw.write("Antonio");

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pode Gravar ==> " + f.canWrite());
    }
}