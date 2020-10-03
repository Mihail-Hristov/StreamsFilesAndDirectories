import java.io.BufferedReader;
import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {

        File inputPat = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");

        File[] files = inputPat.listFiles();
        int size = 0;

        for (int i = 0; i < files.length; i++) {
            long currentSize = files[i].length();
            size += currentSize;

        }

        System.out.println(String.format("Folder size: %d", size));


    }
}
