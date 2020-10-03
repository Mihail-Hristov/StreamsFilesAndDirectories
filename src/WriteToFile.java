import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {


        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath = "output.txt";

        FileInputStream in = null;
        FileOutputStream out = null;

        List<Character> punctuation = new ArrayList<>();
        punctuation.add(',');
        punctuation.add('.');
        punctuation.add('!');
        punctuation.add('?');

        try {
            in = new FileInputStream(inputPath);
            out = new FileOutputStream(outputPath);
            int oneByte = in.read();
            while (oneByte > -1){
                if (!punctuation.contains((char)oneByte)){
                    out.write(oneByte);
                }

                oneByte = in.read();
            }


        }catch (IOException e){
            System.out.println("Missing file!");
        }

    }
}
