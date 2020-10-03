import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        File inputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt");
        File outputPath = new File("onlyCapitals.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputPath));
            writer = new BufferedWriter( new PrintWriter(outputPath));

            int currentChar = reader.read();

            while (currentChar > -1){
                if (currentChar >= 97 && currentChar <= 122){
                    currentChar -= 32;
                }

                writer.write(currentChar);

                currentChar = reader.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
