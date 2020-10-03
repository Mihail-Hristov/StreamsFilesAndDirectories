import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {


        String path = "/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream in = null;

        try {
            in = new FileInputStream(path);
            int oneByte = in.read();
            while (oneByte > -1){
                System.out.print(String.format("%s ", Integer.toBinaryString(oneByte)));
                oneByte = in.read();
            }
        }catch (IOException e){
            System.out.println("Exception error - missing file");
        }finally {
            if (in != null){
                in.close();
            }
        }



    }
}
