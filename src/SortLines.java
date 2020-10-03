import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");
        Path outputPath = Paths.get("sortedLines.txt");

        List<String> lines = Files.readAllLines(path);
        lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
        Collections.sort(lines);

        Files.write(outputPath, lines);


    }
}
