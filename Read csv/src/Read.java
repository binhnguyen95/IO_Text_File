import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("D:/IdeaProjects/IO - Text File/Read csv/countries.csv");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

    }
}
