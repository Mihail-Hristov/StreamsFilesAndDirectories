import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {


        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader reader = null;
        long totalSum = 0;

        try {
            reader = new BufferedReader(new FileReader(inputPath));
            int currentChar = reader.read();

            while (currentChar > -1){
                totalSum += currentChar;

                currentChar = reader.read();
            }

        }catch (IOException e){
            System.out.println("Missing file!");
        }

        System.out.println(totalSum);

    }
}
