import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumLines {
    public static void main(String[] args) {

        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(inputPath));
            String line = in.readLine();

            while (line != null) {
                int sumOfTheLine = 0;

                for (int i = 0; i < line.length(); i++) {
                    sumOfTheLine += line.charAt(i);
                }
                System.out.println(sumOfTheLine);

                line = in.readLine();
            }

        }catch (IOException e){
            System.out.println("Missing file!");
        }
    }
}
