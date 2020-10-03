import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "Integer-output.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }

        out.close();
    }
}
