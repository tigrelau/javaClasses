import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TesteVerificada {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("teste.txt");
            fileWriter.write("Teste");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
