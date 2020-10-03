import java.io.File;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) {


        File filePath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");

        if (filePath.exists()) {
            if (filePath.isDirectory()) {
                File[] files = filePath.listFiles();
                for (File file : files) {
                    if (file.isFile()) {
                        long length = file.length();
                        System.out.println(String.format("%s: [%d]", file.getName(), file.length()));

                    }
                }
            }
        }

    }
}
