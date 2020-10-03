import java.io.*;
import java.nio.file.Files;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        File inputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt");
        File outputPath = new File("countLines.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputPath));
            writer = new BufferedWriter(new FileWriter(outputPath));

            String currentLine = reader.readLine();
            int count = 1;

            while (currentLine != null){

                String add = count + ". " + currentLine;
                writer.write(add);
                writer.newLine();

                count ++;
                currentLine = reader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }



        reader.close();
        writer.close();

    }
}
