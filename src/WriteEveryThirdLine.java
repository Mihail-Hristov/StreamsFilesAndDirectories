import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {


        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "everyThirdLine.txt";

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader(inputPath));
            out = new PrintWriter(new FileWriter(outputPath));

            Stream<String> lines = in.lines();
            List<String> stringLine = lines.collect(Collectors.toList());

            for (int i = 0; i < stringLine.size(); i++) {
                if ((i + 1) % 3 == 0){
                    out.write(stringLine.get(i));
                    out.println();
                }
            }
        }catch (IOException e){
            System.out.println("Missing file!");
        }

        out.flush();
        in.close();
        out.close();

    }
}
