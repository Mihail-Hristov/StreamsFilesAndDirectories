import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        File firstInputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt");
        File secondInputPath = new File("/Users/mihailhristov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/inputTwo.txt");
        File outputPath = new File ("merge.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;


        try {
            reader = new BufferedReader(new FileReader(firstInputPath));
            writer = new BufferedWriter(new FileWriter(outputPath));

           String line = reader.readLine();

           while (line != null){
               writer.write(line);
               writer.newLine();

               line = reader.readLine();
           }

            reader = new BufferedReader(new FileReader(secondInputPath));

           line = reader.readLine();
            while (line != null){
                writer.write(line);
                writer.newLine();

                line = reader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        reader.close();
        writer.close();

    }
}
