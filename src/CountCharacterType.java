import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountCharacterType {
    public static void main(String[] args) throws IOException {

        File inputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt");
        File outputPath = new File("count.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        List<Integer> listOfVowels = new ArrayList<>();
        listOfVowels.add(97);
        listOfVowels.add(101);
        listOfVowels.add(105);
        listOfVowels.add(111);
        listOfVowels.add(117);

        try {
            reader = new BufferedReader(new FileReader(inputPath));
            writer = new BufferedWriter(new FileWriter(outputPath));

            int currentChar = reader.read();

            while (currentChar > -1){
                if (listOfVowels.contains(currentChar)){
                    vowels ++;
                }else if (currentChar == '!' || currentChar == ',' || currentChar == '.' || currentChar == '?'){
                    punctuation ++;
                }else if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 98 && currentChar <= 122) || (currentChar >= 33 && currentChar <= 64)){
                    consonants ++;
                }

                currentChar = reader.read();
            }

            String output = "Vowels: " + vowels + System.lineSeparator()
                    + "Consonants: " + consonants + System.lineSeparator()
                    + "Punctuation: " + punctuation;

            //System.out.println(output);

            writer.write(output);

        }catch (IOException e){
            e.printStackTrace();
        }

        reader.close();
        writer.close();



    }
}
