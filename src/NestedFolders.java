import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class NestedFolders {
    public static void main(String[] args) {

        File path = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");

        Deque<File> listOfFolders = new ArrayDeque<>();

        listOfFolders.add(path);

        int count = 0;

        while (!listOfFolders.isEmpty()){
            count ++;
            File currentPath = listOfFolders.poll();

            System.out.println(currentPath.getName());

            File[] files = currentPath.listFiles();

            for (File f : files) {
                if (f.isDirectory()){
                    listOfFolders.offer(f);
                }
            }
        }

        System.out.println(String.format("[%d] folders", count));

    }
}
