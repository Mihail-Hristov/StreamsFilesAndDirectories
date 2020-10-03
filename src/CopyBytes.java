import com.sun.jdi.Value;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String inputPath = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String output = "output.txt";

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(inputPath);
            out = new FileOutputStream(output);
            int oneByte = in.read();
            while (oneByte > -1){
                if (oneByte == 32 || oneByte == 10){
                    out.write(oneByte);
                }else {
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        out.write(digit.charAt(i));
                    }
                }

                oneByte = in.read();
            }


        }catch (IOException e){
            System.out.println("Missing file!");
        }finally {
            in.close();
            out.close();
        }

    }
}
