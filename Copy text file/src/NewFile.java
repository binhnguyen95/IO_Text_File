import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Source");
            FileWriter fw = new FileWriter("Destination");
            int line;
            while ((line = fr.read()) != -1) {
                fw.write((char) line);
            }
            fr.close();
            fw.close();
            System.out.println("Copy file succesful !");
        } catch (FileNotFoundException e) {
            System.err.println("File not found !");
        } catch (IOException e) {
            System.err.println("Error in IO !");
        }

    }
}
