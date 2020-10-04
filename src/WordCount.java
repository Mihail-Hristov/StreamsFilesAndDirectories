import java.io.*;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {


        File firstInputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/words.txt");
        File secondInputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/text.txt");
        //File outputPath = new File ("word-count.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;

        Map<String, Integer> words = new LinkedHashMap<>();


        try {
            reader = new BufferedReader(new FileReader(firstInputPath));
            String[] searchingWords = reader.readLine().split("\\s+");
            for (String word : searchingWords) {
                words.put(word, 0);
            }

            reader = new BufferedReader(new FileReader(secondInputPath));

            String lines = reader.readLine();
            while (lines != null){
                String[] currentWords = lines.split("\\s+");
                for (String word : currentWords) {
                    if (words.containsKey(word)){
                        words.put(word, words.get(word) + 1);
                    }
                }

                lines = reader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        words.entrySet().stream().forEach(w -> {
            System.out.println(String.format("%s - %d", w.getKey(), w.getValue()));
        });

        reader.close();

    }
}
